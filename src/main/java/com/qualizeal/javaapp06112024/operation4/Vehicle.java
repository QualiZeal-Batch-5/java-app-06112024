package com.qualizeal.javaapp06112024.operation4;

public class Vehicle {
	// make, model, year, and fuel

	private String make;
	private String model;
	private int year;
	private int fuel;

	public double calculateFuelEfficiency() {
		return 0.0;
	}

	public double calculateDistanceTraveled(double fuelAmount) {
		return 0.0;
	}

	public double getMaxSpeed() {
		return 0.0;
	}

	public Vehicle(String make, String model, int year, int fuel) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuel = fuel;
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

	public int getFuel() {
		return fuel;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

}
