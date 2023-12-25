package com.company.luviel19.lesson13;

public class Service<T> {
    private T element;

    public Service() {
    }

    public Service(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void startRepair(){
        System.out.println(element);
    }
}