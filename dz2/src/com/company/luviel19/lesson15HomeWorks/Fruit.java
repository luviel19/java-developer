package com.company.luviel19.lesson15HomeWorks;

import java.util.Objects;

// remove(index)
// add(index, object)
public class Fruit {
    private final FruitType type;
    private double price;
    private int count;

    // конструктор, принимающий значения всех свойств + проверки

    public Fruit(FruitType type, double price, int count) {
        this.type = type;
        this.price = price;
        this.count = count;
    }

    // доступные геттеры и сеттеры


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

    // equals + hashCode + toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(price, fruit.price) == 0 && count == fruit.count && type == fruit.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, count);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

    public enum FruitType {
        APPLE, PEAR, BANANA, APRICOT;

    }
}