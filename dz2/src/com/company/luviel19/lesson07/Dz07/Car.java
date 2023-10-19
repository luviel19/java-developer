package com.company.luviel19.lesson07.Dz07;

/*
1.Машина наследуется от Транспортного средства и расширяет его свойством String color со значением по умолчанию - белый.
2.  В классе добавить возможность изменения цвета.
3.Необходимо реализовать класс таким образом, чтобы значение по умолчанию для максимальной скорости было рано 240.
4.Реализация метода repair: уменьшение уровня износа на 1, но не меньше 0*/
public class Car extends Vehicle {
    private String color = "white";
    private int maxSpeed = 240;
}

    public Car(String color, int maxSpeed, String number) {
        super(number, maxSpeed);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void setColor(String newColor) {
        color = newColor
    }

    public void repairCar() {
        if (damage >= 0) {
            damage -= 1;
        } else {
            super.repair();
        }
    }
}