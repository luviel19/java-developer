package com.company.luviel19.lesson07.Dz07;

public class RepairShop {

    protected Vehicle[] vehicles = new Vehicle[4]; // null
    protected String[] colors = {"красный", "жёлтый", "оранжевый", "чёрный"};

    public void addToVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            vehicle = new Vehicle[1];
            Vehicle[0] = vehicle;
            Vehicle[] NewVehicle = new Vehicle[vehicles.length + 1];
            for (int i = 0; i < vehicles.length; i++) {
                NewVehicle[i] = vehicle[i];
            }
            NewVehicle[NewVehicle.length - 1] = vehicle;
        }
    }

    public void repairAll() {

        // [car, scooter, train, null]
        for (Vehicle vehicle : vehicles) {

            vehicle.repair();
            vehicle = null;

        }
    }
}

