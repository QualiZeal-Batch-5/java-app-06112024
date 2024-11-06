package com.qualizeal.javaapp;

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

	public double calculateFuelEfficiency() {
		return 0.0;
	}

	public double calculateDistanceTraveled(double fuelUsed) {
		return calculateFuelEfficiency() * fuelUsed;
	}

	public int getMaxSpeed() {
		return 0;
	}
}
