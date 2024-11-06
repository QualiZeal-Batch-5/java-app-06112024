package com.qualizeal.javaapp06112024.operation;

public class Car extends Vehicle {
	public Car(String make, String model, int year, String fuelType) {
		super(make, model, year, fuelType);
	}

	public double fuelEfficiency() {
		return 60.0;
	}
	
	public double distanceTraveled() {
		return 54.0;
	}
	
	public double maximumSpeed() {
		return 150.0;
	}
}
