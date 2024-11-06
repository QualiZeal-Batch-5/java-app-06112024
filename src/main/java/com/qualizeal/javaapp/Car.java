package com.qualizeal.javaapp;

public class Car extends Vehicle {
	public int seatingCapacity;

	public Car(String make, String model, int year, String fuelType, int seatingCapacity) {
		super(make, model, year, fuelType);
		this.seatingCapacity = seatingCapacity;
	}

	public double calculateFuelEfficiency() {
		return 25.0;
	}

	public double calculateDistanceTraveled(double fuelUsed) {
		return calculateFuelEfficiency() * fuelUsed;
	}

	public int getMaxSpeed() {
		return 120;
	}
}
