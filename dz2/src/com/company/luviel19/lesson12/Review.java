package com.company.luviel19.lesson12;

import java.time.LocalDateTime;

public record Review(long id, String text, LocalDateTime createdAt) {
    public Review {
        if (id < 0 || text.trim().length() < 5 || createdAt == null) {
            throw new IllegalArgumentException("Переданы невалидные данные");
        }
    }

    public Review(String text) {
        this(0, text);
    }

    public Review(long id, String text) {
        this(id, text, null);

    }
    public String text(){
        return text.toUpperCase();
    }
}
