package com.qualizeal.javaapp06112024.operation;

public class Truck extends Vehicle {
	public Truck(String make, String model, int year, String fuelType) {
		super(make, model, year, fuelType);
	}

	public double fuelEfficiency() {
		return 50.0;
	}
	
	public double distanceTraveled() {
		return 23.4;
	}
	
	public double maximumSpeed() {
		return 100.0;
	}
}
