package com.qualizeal.javaapp06112024.operation;

public class Motorcycle extends Vehicle{
	public String make = "Honda";
	public String model = "qwerty";
	public int year = 2000;
	String fuelType = "petrol";
	
	public String fuelEfficiency() {
		if(fuelType == "petrol") {
			return "Efficient.";
		}
		else {
			return "Not Efficient.";
		}
	}
	
	public double distanceTravelled() {
		return 200000.31;
	}
	
	public double maximumSpeed() {
		return 100.0;
	}
}
