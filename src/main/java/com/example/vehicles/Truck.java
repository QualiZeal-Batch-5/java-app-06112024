package com.example.vehicles;

public class Truck extends Vehicle {
    private double loadCapacity; 

    public Truck(String make, String model, int year, String fuelType, double loadCapacity) {
        super(make, model, year, fuelType);
        this.loadCapacity = loadCapacity;
    }

    
    public double calculateFuelEfficiency() {
        return 8.0; 
    }

 
    public double calculateDistanceTraveled(double fuel) {
        return fuel * calculateFuelEfficiency();
    }

   
    public double getMaxSpeed() {
        return 120.0;
    }
}
