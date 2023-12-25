package com.company.luviel19.lesson1516;

public class Fruit {
    private  FruitType type;
    private double price;
    private int count;

    // конструктор, принимающий значения всех свойств + проверки

    // доступные геттеры и сеттеры

    // equals + hashCode + toString
    public enum FruitType {
        APPLE, PEAR, BANANA, APRICOT;
    }

    public Fruit(FruitType type, double price, int count) {
        this.type = type;
        this.price = price;
        this.count = count;
    }

    public FruitType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}