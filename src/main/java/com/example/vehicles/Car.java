package com.example.vehicles;

public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String make, String model, int year, String fuelType, int seatingCapacity) {
        super(make, model, year, fuelType);
        this.seatingCapacity = seatingCapacity;
    }

    
    public double calculateFuelEfficiency() {
        return 15.0;
    }

    
    public double calculateDistanceTraveled(double fuel) {
        return fuel * calculateFuelEfficiency();
    }

    
    public double getMaxSpeed() {
        return 180.0; 
    }
}
