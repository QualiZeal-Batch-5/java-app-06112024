package com.qualizeal.javaapp06112024.operation4;

public class Truck extends Vehicle {
	public Truck(String make, String model, int year, int fuel) {
		super(make, model, year, fuel);
	}

	public double calculateFuelEfficiency() {
		return 8.0;
	}

	public double getMaxSpeed() {
		return 120.0;
	}

}
