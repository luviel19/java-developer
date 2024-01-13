package com.company.luviel19.exam.exam03;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 12345); // Замените IP-адрес и порт на нужные
            Thread sendThread = new Thread(new SendThread(socket));
            Thread receiveThread = new Thread(new ReceiveThread(socket));

            sendThread.start();
            receiveThread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


