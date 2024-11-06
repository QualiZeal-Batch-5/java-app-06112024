package com.qualizeal.javaapp;

public class MotorCycle extends Vehicle {
	
    boolean hasSidecar;

    public MotorCycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
    	
        super(make, model, year, fuelType);
        
        this.hasSidecar = hasSidecar;
    }

    public double calculateFuelEfficiency() {
    	
        return 50.0; 
        
    }

    public double calculateDistanceTraveled(double gallons) {
    	
        return gallons * calculateFuelEfficiency();
        
    }

    public double getMaxSpeed() {
    	
        return 140.0;
        
    }
}
