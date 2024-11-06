package com.example.vehicles;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
        super(make, model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

 
    public double calculateFuelEfficiency() {
        return 25.0; 
    }

    
    public double calculateDistanceTraveled(double fuel) {
        return fuel * calculateFuelEfficiency();
    }

  
    public double getMaxSpeed() {
        return 200.0; 
    }
}
