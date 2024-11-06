package com.qualizeal.javaapp.operation;

public class Car extends Vehicle{

	public String make = "Nissan";
	public String  model = "Renault";
	public long year = 1968;
	public String fuelType = "diesel";
	
	public double fuelEfficiency() {
		return 234.5;
	}
	
	public double distanceTraveled() {
		return 46864;
	}
	
	public double maximumSpeed() {
		return 350;
	}
}
