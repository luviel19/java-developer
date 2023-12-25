package com.company.luviel19.lesson13;

public class RepairShop<T extends Vehicle & Repaintable & Runnable> extends Service<T>{

    public RepairShop(T element) {
        super(element);
    }

    @Override
    public void startRepair(){
        getElement().run(); // можно вызвать т.к "T .. & Runnable"
        getElement().changeColor(Repaintable.Color.BLUE); // можно вызвать, т.к "T .. & Repaintable"
        getElement().repair(); // можно вызвать, т.к "T extends Vehicle ... "
        System.out.println(getElement().hashCode()); // можно вызвать, т.к "T extends Vehicle ... " и Vehicle - наследник Object
    }
