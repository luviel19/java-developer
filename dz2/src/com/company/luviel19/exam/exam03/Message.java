package com.company.luviel19.exam.exam03;

import java.time.LocalDateTime;

public class Message {
    private String text;
    private LocalDateTime sent;

    public Message(String text) {
        this.text = text;
    }

    public void setSent(LocalDateTime sent) {
        this.sent = sent;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getSent() {
        return sent;
    }
}

