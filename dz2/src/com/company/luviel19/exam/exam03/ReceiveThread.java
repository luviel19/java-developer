package com.company.luviel19.exam.exam03;

import java.net.Socket;

class ReceiveThread implements Runnable {
    private Socket socket;

    public ReceiveThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

    }
}