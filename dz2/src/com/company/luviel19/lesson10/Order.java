package com.company.luviel19.lesson10;

import java.util.Arrays;

public class Order {
    private final Item[] items;

    public Order(Item[] items) {
        this.items = items;
    }

    public Item[] items() {
        return items;
    }

    // + переопределенные методы equals и hashCode
    //ПКМ -> Generate -> equasl() + hashCode()


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Arrays.equals(items, order.items);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(items);
    }

    //глубокая копия объекта
    public Order clone() {
        Item[] items1 = new Item[items.length];
        for (int i = 0; i == items.length; i++) {
            items1[i] = items[i].clone();
        }

        return new Order(items1);
    }
}
