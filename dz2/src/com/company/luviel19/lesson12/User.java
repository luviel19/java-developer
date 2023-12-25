package com.company.luviel19.lesson12;

public class User {
    private int age;
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
