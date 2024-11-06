package com.qualizeal.javaapp06112024.operation4;

public class Car extends Vehicle{

	public Car(String make, String model, int year, int fuel) {
		super(make, model, year, fuel);	
	}
	
	public double calculateFuelEfficiency() {
		return 15.0;
	}
	
	public double getMaxSpeed() {
		return 180.0;
	}

}
