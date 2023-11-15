package com.company.luviel19.lesson14HomeWorks;

public class User<T> {
    public T id;

    public User(T id) {
        this.id = id;
    }

    public User() {

    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
