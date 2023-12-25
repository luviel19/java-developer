package com.company.luviel19.lesson10HomeWorks.animals;
import java.util.Arrays;
import com.company.luviel19.lesson10HomeWorks.animals.Wolf;
import com.company.luviel19.lesson10HomeWorks.animals.WildAnimal;
public class equals {
    public static void main(String[] args){
        Wolf wolf01 = new Wolf(new String[]{"meat", "Rabbit"},"black");
        Wolf wolf02 = new Wolf(new String[]{"meat", "Rabbit"},"black");
        Wolf wolf03 = new Wolf(new String[]{"meat", "Fish"},"black");
        wolf01.setStrength(1);wolf01.setAge(2);wolf01.setName("Волк"); //wolf 01
        wolf02.setStrength(1);wolf02.setAge(2);wolf02.setName("Волк"); //wolf 02
        wolf03.setStrength(1);wolf03.setAge(2);wolf03.setName("Волк"); //wold 03
        System.out.println(wolf01.equals(wolf03));
        System.out.println(wolf01.equals(wolf02));

    }
}
