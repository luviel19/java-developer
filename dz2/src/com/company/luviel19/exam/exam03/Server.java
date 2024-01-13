package com.company.luviel19.exam.exam03;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class Server {
    private static final int PORT = 12345; // Порт сервера
    private static final int N = 100; // Максимальная длина описания файла
    private static final long M = 1024 * 1024; // Максимальный размер файла (1 MB)

    private static ConcurrentHashMap<Socket, PrintWriter> activeClients = new ConcurrentHashMap<>();
    private static List<String> fileNames = new ArrayList<>();
    private static Map<String, byte[]> fileContents = new HashMap<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Сервер запущен на порту " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                Thread clientThread = new Thread(new ClientHandler(clientSocket));
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {
        private Socket clientSocket;

        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        @Override
        public void run() {
            try {
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                activeClients.put(clientSocket, out);

                String clientMessage;
                while ((clientMessage = in.readLine()) != null) {
                    if (clientMessage.equalsIgnoreCase("exit")) {
                        break;
                    } else if (clientMessage.startsWith("UPLOAD")) {
                        handleFileUpload(clientSocket, clientMessage);
                    } else if (clientMessage.equals("LIST")) {
                        sendFileList(clientSocket);
                    } else if (fileContents.containsKey(clientMessage)) {
                        sendFileContent(clientSocket, clientMessage);
                    } else {
                        broadcastMessage(clientMessage);
                    }
                }

                activeClients.remove(clientSocket);
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void handleFileUpload(Socket clientSocket, String message) {
            try {
                String[] parts = message.split(" ");
                if (parts.length != 4) {
                    sendErrorMessage(clientSocket, "Неверный формат сообщения для загрузки файла.");
                    return;
                }

                String fileName = parts[1];
                String description = parts[2];
                long fileSize = Long.parseLong(parts[3]);

                if (fileSize > M) {
                    sendErrorMessage(clientSocket, "Размер файла превышает максимальный размер.");
                    return;
                }

                if (description.length() > N) {
                    sendErrorMessage(clientSocket, "Длина описания файла превышает максимальную длину.");
                    return;
                }

                byte[] fileData = new byte[(int) fileSize];
                InputStream inputStream = clientSocket.getInputStream();
                FileOutputStream fileOutputStream = new FileOutputStream(fileName);

                int bytesRead;
                while ((bytesRead = inputStream.read(fileData)) != -1) {
                    fileOutputStream.write(fileData, 0, bytesRead);
                }
                fileOutputStream.close();

                fileNames.add(fileName);
                fileContents.put(fileName, fileData);

                broadcastMessage("Новый файл загружен: " + fileName + " (" + description + ")");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void sendFileList(Socket clientSocket) {
            PrintWriter out = activeClients.get(clientSocket);
            out.println("Доступные файлы:");
            for (String fileName : fileNames) {
                out.println(fileName);
            }
        }

        private void sendFileContent(Socket clientSocket, String fileName) {
            byte[] content = fileContents.get(fileName);
            try {
                OutputStream outputStream = clientSocket.getOutputStream();
                outputStream.write(content);
                outputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void sendErrorMessage(Socket clientSocket, String errorMessage) {
            PrintWriter out = activeClients.get(clientSocket);
            out.println("Ошибка: " + errorMessage);
        }

        private void broadcastMessage(String message) {
            for (PrintWriter clientWriter : activeClients.values()) {
                clientWriter.println(message);
            }
        }
    }
}
