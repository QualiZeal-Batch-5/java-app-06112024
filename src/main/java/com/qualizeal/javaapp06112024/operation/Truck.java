package com.qualizeal.javaapp06112024.operation;

public class Truck extends Vehicle {
	
	    private double loadCapacity;  

	    
	    public Truck(String make, String model, int year, String fuelType, double loadCapacity) {
	        super(make, model, year, fuelType);
	        this.loadCapacity = loadCapacity;
	    }

	   
	    public double getLoadCapacity() {
	        return loadCapacity;
	    }

	    
	    public double calculateFuelEfficiency() {
	        
	        return 15.0;
	    }

	    
	    public double calculateDistance(double fuelAmount) {
	        return calculateFuelEfficiency() * fuelAmount;  // Distance = MPG * Fuel Amount
	    }

	    
	    public double calculateMaxSpeed() {
	        return 80.0;
	    }
	}
	