package com.qualizeal.javaapp06112024.operation;

public class Vehicle {
	
	public String make;
	public String model;
	public int year;
	public String fuelType;
	
	public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
	public double fuelEfficiency() {
		return 0.0;
	}
	
	public double distanceTraveled() {
		return 0.0;
	}
	
	public double maximumSpeed() {
		return 0.0;
	}
}
