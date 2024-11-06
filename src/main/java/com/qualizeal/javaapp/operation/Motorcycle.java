package com.qualizeal.javaapp.operation;

public class Motorcycle extends Vehicle {
	

	public String make = "Honda";
	public String  model = "Unicon";
	public long year = 1980;
	public String fuelType = "petrol";
	
	public double fuelEfficiency() {
		return 234;
	}
	
	public double distanceTraveled() {
		return 346775;
	}
	
	public double maximumSpeed() {
		return 250;
	}
}
