package com.qualizeal.javaapp;

public abstract class Vehicle {
	
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
    
    public double calculateDistance(double fuelAmount) {
        return calculateFuelEfficiency() * fuelAmount; // distance = fuelEfficiency * fuelAmount
    }
    
    
    public abstract double calculateMaxSpeed();
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return make;
    }
    
    public String getYear() {
        return make;
    }
    
    public String getFuelType() {
        return make;
    }
    
    public void displayInfo() {
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
        System.out.println(fuelType);
    }
}


