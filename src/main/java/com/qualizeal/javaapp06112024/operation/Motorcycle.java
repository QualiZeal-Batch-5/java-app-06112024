package com.qualizeal.javaapp06112024.operation;

public class Motorcycle extends Vehicle {
	public Motorcycle(String make, String model, int year, String fuelType) {
		super(make, model, year, fuelType);
	}

	public double fuelEfficiency() {
		return 50.0;
	}
	
	public double distanceTraveled() {
		return 24.0;
	}
	
	public double maximumSpeed() {
		return 110.0;
	}
}
