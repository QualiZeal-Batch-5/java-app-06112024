package com.qualizeal.javaapp;

public class Car extends Vehicle {
	
    int numberOfDoors;

    public Car(String make, String model, int year, String fuelType, int numberOfDoors) {
    	
        super(make, model, year, fuelType);
        
        this.numberOfDoors = numberOfDoors;
        
    }

    
    public double calculateFuelEfficiency() {
    	
        return 25.0; 
        
    }

    public double calculateDistanceTraveled(double gallons) {
    	
        return gallons * calculateFuelEfficiency();
        
    }

    public double getMaxSpeed() {
    	
        return 120.0; 
    }
}
