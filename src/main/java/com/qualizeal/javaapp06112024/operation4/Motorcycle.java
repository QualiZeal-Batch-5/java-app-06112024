package com.qualizeal.javaapp06112024.operation4;

public class Motorcycle extends Vehicle{

	public Motorcycle(String make, String model, int year, int fuel) {
		super(make, model, year, fuel);
	}
	
	public double calculateFuelEfficiency() {
		return 25.0;
	}
	
	public double getMaxSpeed() {
		return 200.0;
	}


}
