package com.qualizeal.javaapp.assign4;

public class Truck {
	String make;
	String model;
	int year;
	String fuel;

	public Truck(String make, String model, int year, String fuel) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuel = fuel;
	}

	public double fuelEfficiency() {
		return 50;

	}

	public double distanceTraveled() {
		return 500;

	}

	public int maximumSpeed() {
		return 80;
	}

}
