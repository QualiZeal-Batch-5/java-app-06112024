package com.qualizeal.javaapp.assign4;

public class Car {
	String make;
	String model;
	int year;
	String fuel;

	public Car(String make, String model, int year, String fuel) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuel = fuel;
	}

	public double fuelEfficiency() {
		return 100;
	}

	public double distanceTraveled() {
		return 60;
	}

	public int maximumSpeed() {
		return 200;
	}

}
