package com.qualizeal.javaapp06112024.operation;

public class Car extends Vehicle {
	
	    private int numberOfDoors;

	    
	    public Car(String make, String model, int year, String fuelType, int numberOfDoors) {
	        super(make, model, year, fuelType);
	        this.numberOfDoors = numberOfDoors;
	    }

	    
	    public int getNumberOfDoors() {
	        return numberOfDoors;
	    }

	    
	    public double calculateFuelEfficiency() {
	        
	        return 30.0;
	    }

	    
	    public double calculateDistance(double fuelAmount) {
	        return calculateFuelEfficiency() * fuelAmount;
	    }

	    
	    public double calculateMaxSpeed() {
	        return 120.0;

	    }
}	    
	    



