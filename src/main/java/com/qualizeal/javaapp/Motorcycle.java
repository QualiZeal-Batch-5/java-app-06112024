package com.qualizeal.javaapp;

public class Motorcycle extends Vehicle {
	public boolean hasSidecar;

	public Motorcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
		super(make, model, year, fuelType);
		this.hasSidecar = hasSidecar;
	}

	public double calculateFuelEfficiency() {
		return 50.0;
	}

	public double calculateDistanceTraveled(double fuelUsed) {
		return calculateFuelEfficiency() * fuelUsed;
	}

	public int getMaxSpeed() {
		return 100;
	}
}
