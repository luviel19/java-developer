package com.company.luviel19.lesson15HomeWorks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class FruitsStorage {
    // максимальное количество фруктов
    private int numberOfSlots;
    private ArrayList<Fruit> fruits;


    // коллекция fruits, для хранения экземпляров Fruit

    public FruitsStorage(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
        this.fruits = new ArrayList<>();
    }

    // Реализация методов
    public boolean addToStorage(Fruit fruit){
if(fruit == null) return false;
for(Fruit fruit01 : fruits){
    if (fruit01 == fruit) return false;
    if(fruit01.equals(fruit)){
       fruit01.setCount(fruit01.getCount()+fruit.getCount());
       numberOfSlots -= fruit.getCount();
       return true;
    }
}


        // фрукты добавляются в хранилище по следующим правилам:
        // * fruit не может быть null
        // * fruit не может быть ссылкой на существующий элемент коллекции
        // * если в коллекции fruits уже есть фрукт с типом и ценой, как у fruit,
        //   увеличивать значение свойства count фрукта коллекции на значение свойства count
        //   добавляемого фрукта. В противном случае добавлять fruit в коллекцию fruits.
        //   numberOfSlots уменьшается на значение count добавляемого фрукта.
        // * в хранилище нельзя добавить больше numberOfSlots фруктов
        return false;
    }

    // вернуть количество фруктов определённого типа
    public int getNumberOfFruitsByType(Fruit.FruitType fruitType) {
        return 0;
    }

    // вернуть количество свободных мест в хранилище
    public int getNumberOfEmptySlots(){
        return 0;
    }

    public void increasePrice(int value){
        // value может быть в диапазоне [10; 30)
        // увеличить цену всех фруктов на value процентов
    }

    public List<Fruit> getFruitsByTypeAndPrice(Fruit.FruitType fruitType, int maxPrice) {
        // maxPrice должна быть положительной, fruitType не null
        // возвращает список, в который войдут фрукты из коллекции fruits
        // с типом fruitType и ценой не выше maxPrice
        return null;
    }

    public Set<Fruit.FruitType> getFruitTypes(){
        // возвращает ссылку на множество с типами фруктов в хранилище
        return null;
    }

    public double getMinPriceByType(Fruit.FruitType fruitType){
        // вернуть минимальную цену фрукта с типом fruitType
        return 0;
    }
}
