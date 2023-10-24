package com.company.luviel19.lesson10HomeWorks.animals;

import java.util.Arrays;
import java.util.Objects;

public class Wolf extends com.company.luviel19.lesson10HomeWorks.animals.WildAnimal {
    private final String[] likeToEat;
    private final String color;


    public Wolf(String[] likeToEat, String color) {
        this.likeToEat = likeToEat;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wolf wolf = (Wolf) o;
        return Arrays.equals(this.likeToEat, wolf.likeToEat) && Objects.equals(this.color, wolf.color) && Objects.equals(this.getName(),
                wolf.getName()) && Objects.equals(this.getAge(),wolf.getAge()) && Objects.equals(this.getStrength(),wolf.getStrength());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(color);
        result = 31 * result + Arrays.hashCode(likeToEat);
        return result;
    }
}