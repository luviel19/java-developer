package com.company.luviel19.Dz7;

public class Cat {
    private String name;
    private double weight;
    private boolean win;

    public Cat() {
        this.name = "мурзик";
        this.weight = 3;
    }

    public Cat(String name, int weight) {
        setName(name);
        setWeight(weight);

    }

    public void setName(String name) {
        if (name.replace(" ", "").length() > 2 && name != null) {
            this.name = name;
        }
    }


    public void setWeight(double weight) {
        if (weight > 0 && weight < 9) {
            this.weight = weight;
        }
    }

    public int toWin() {
        return win;
    }

    public boolean attack(Cat theOpponent) {
        if (theOpponent == null) {
            throw new IllegalArgumentException("The opponent can not be null");
        }
        if (theOpponent.weight < this.weight) {
            this.win++;
            return true;
        } else {
            theOpponent.win++;
            return false;
        }
    }
}



