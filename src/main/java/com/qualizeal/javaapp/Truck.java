package com.qualizeal.javaapp;

public class Truck extends Vehicle {
	
    private double loadCapacity;
    
    public Truck(String make, String model, int year, String fuelType, double loadCapacity) {
        super(make, model, year, fuelType);
        this.loadCapacity = loadCapacity;
    }
    
    public double calculateFuelEfficiency() {
        return 8.0;
    }
    
    public double calculateMaxSpeed() {
        return 120.0;
    }

    
    public double getLoadCapacity() {
        return loadCapacity;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println(loadCapacity);
    }

}
