package com.qualizeal.javaapp;

public class Truck extends Vehicle {
    private int cargoCapacity;  

    public Truck(String make, String model, int year, String fuelType, int cargoCapacity) {
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

  
    public double calculateFuelEfficiency() {
        return 6.0; 
    }

    public double calculateDistanceTraveled(double fuelUsed) {
        return calculateFuelEfficiency() * fuelUsed;
    }

    public int getMaxSpeed() {
        return 80; 
}
}
