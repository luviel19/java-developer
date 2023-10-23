package com.company.luviel19.lesson10HomeWorks.animals;
import java.util.Arrays;
public class equals {
    public static void main(String[] args){
        Wolf wolf01 = new Wolf(new String[]{"meat", "Rabbit"},"black");
        Wolf wolf02 = new Wolf(new String[]{"meat", "Rabbit"},"black");
        Wolf wolf03 = new Wolf(new String[]{"meat", "Fish"},"black");
        System.out.println(wolf01.equals(wolf03));
        System.out.println(wolf01.equals(wolf02));

    }
}
