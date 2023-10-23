package com.company.luviel19.lesson10;

import java.util.Objects;

public class /* extends Object*/ Item  {
    private final String name;
    private final double initialPrice;
    private double currentPrice;

    public Item(String name, double price) {
        this.name = name;
        this.initialPrice = price;
        this.currentPrice = price;
    }
    // геттеры + сеттер для currentPrice

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getName() {
        return name;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(initialPrice, item.initialPrice) == 0 && Double.compare(currentPrice, item.currentPrice) == 0 && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, initialPrice, currentPrice);
    }

    public Item clone() {
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }

    public String toString() {
        return "Item{" + "name='" + name + '\'' + ", initialPrice=" + initialPrice + ", currentPrice=" + currentPrice + '}';
    }
}
