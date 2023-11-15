package com.company.luviel19.lesson14HomeWorks;

public class PairContainer<T, S> {
    private T key;
    private S value;

    public PairContainer(T key, S value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }


    public S getValue() {
        return value;
    }

}
