package com.qualizeal.javaapp.assign4;

public class MotorCycle {
	String make;
	String model;
	int year;
	String fuel;

	public MotorCycle(String make, String model, int year, String fuel) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuel = fuel;
	}

	public double fuelEfficiency() {
		return 5;
	}

	public double distanceTraveled() {
		return 80;
	}

	public int maximumSpeed() {
		return 100;
	}

}
