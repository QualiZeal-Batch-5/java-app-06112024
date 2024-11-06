package com.qualizeal.javaapp06112024.operation;

public class MotorCycle extends Vehicle {
	private boolean hasSidecar;  

    
    public  MotorCycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
        super(make, model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    
    public boolean hasSidecar() {
        return hasSidecar;
    }

    
    public double calculateFuelEfficiency() {
       
        return 50.0;
    }

    
    public double calculateDistance(double fuelAmount) {
        return calculateFuelEfficiency() * fuelAmount;
    }

    
    public double calculateMaxSpeed() {
        return 180.0;  
    }
}


