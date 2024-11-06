package com.qualizeal.javaapp06112024.operation;

public class Vehicle {
	protected String make;
    protected String model;
    protected int year;
    protected String fuelType;
    
    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    
    public String getMake() {
    	return make;
    }
    
    public String getModel() {
    	return model;
    }
    
    public int getYear() {
    	return year;
    }
    
    public String getFuelType() {
    	return fuelType;
    }
    
    
}
