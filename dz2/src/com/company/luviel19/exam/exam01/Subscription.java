package com.company.luviel19.exam.exam01;

import java.time.LocalDate;

public class Subscription {
    private String name,surname;
    LocalDate today = LocalDate.now();
    private int max = today.plusYears(80).getYear();
            private int min =today.minusYears(18).getYear();
    public Subscription(String name, String surname, int year){
        if(name.length()<1) throw new IllegalArgumentException("The name should not be empty!");
        if(surname.length()<1) throw new IllegalArgumentException("The last name should not be empty");
        if (min < 18 || 80 > max) throw new IllegalArgumentException("Age is not suitable");
        this.name = name;
        this.surname = surname;
        this.max = max;
        this.min = min;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getToday() {
        return today;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year="  +
                '}';
    }
}
