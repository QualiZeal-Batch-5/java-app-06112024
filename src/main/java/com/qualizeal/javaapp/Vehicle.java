package com.qualizeal.javaapp;

abstract class Vehicle {
	
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
    
    public abstract double calculateFuelEfficiency(); 
    
    public abstract double calculateDistanceTraveled(double gallons); 
    
    public abstract double getMaxSpeed(); 
}
