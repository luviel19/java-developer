package com.company.luviel19.exam.exam01;

public class Subscription {
    private String name,surname;
    private int year;
    public Subscription(String name, String surname, int year){
        if(name.length()<1) throw new IllegalArgumentException("The name should not be empty!");
        if(surname.length()<1) throw new IllegalArgumentException("The last name should not be empty");
        if (year > 2005 || year < 1943) throw new IllegalArgumentException("Age is not suitable");
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                '}';
    }
}
