package com.company.luviel19.exam.exam03;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class SendThread implements Runnable {
    private Socket socket;

    public SendThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Введите сообщение (или 'exit' для выхода): ");
                String message = scanner.nextLine();

                if (message.equalsIgnoreCase("exit")) {
                    out.println(message);
                    break;
                } else {
                    out.println(message);
                }
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}