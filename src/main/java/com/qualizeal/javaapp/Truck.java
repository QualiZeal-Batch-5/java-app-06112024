package com.qualizeal.javaapp;


public class Truck extends Vehicle {
	
    double loadCapacity; 

    public Truck(String make, String model, int year, String fuelType, double loadCapacity) {
    	
        super(make, model, year, fuelType);
        
        this.loadCapacity = loadCapacity;
        
    }

    public double calculateFuelEfficiency() {
    	
        return 15.0; 
        
    }

    public double calculateDistanceTraveled(double gallons) {
    	
        return gallons * calculateFuelEfficiency();
        
    }

    public double getMaxSpeed() {
    	
        return 80.0; 
        
    }
}