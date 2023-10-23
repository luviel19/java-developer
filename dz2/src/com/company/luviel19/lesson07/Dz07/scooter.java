package com.company.luviel19.lesson07.Dz07;

public class scooter extends Bicycle {
    protected int wheels = 2;
    protected String typeOfScooter = "urban";
    protected boolean electric;

    public scooter(String number, int maxSpeed, int wheels, String typeOfScooter, boolean electric) {
        super(number, maxSpeed, wheels, typeOfScooter);
        this.electric = electric;
    }

    public void repair() {
        if (electric) {
            damage -= 1;
        } else {
            damage = -1;
            super.repair();
        }
    }
}
