package com.qualizeal.javaapp;

public class Car extends Vehicle{
	
	    private int numberOfDoors;

	    
	    public Car(String make, String model, int year, String fuelType, int numberOfDoors) {
	        super(make, model, year, fuelType);
	        this.numberOfDoors = numberOfDoors;
	    }

	    
	    public double calculateFuelEfficiency() {
	        return 25.0; 
	    }

	    
	    public double calculateMaxSpeed() {
	        return 150.0; 
	    }

	    
	    public int getNumberOfDoors() {
	        return numberOfDoors;
	    }

	    
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println(numberOfDoors);
	    }
	}



