package com.qualizeal.javaapp06112024.operation;

public class Car extends Vehicle{
	public String make = "Hynudai";
	public String model = "asdf";
	public int year = 2024;
	String fuelType = "diesel";
	
	public String fuelEfficiency() {
		if(fuelType == "petrol") {
			return "Efficient.";
		}
		else {
			return "Not Efficient.";
		}
	}
	
	public double distanceTravelled() {
		return 300000.31;
	}
	
	public double maximumSpeed() {
		return 120.0;
	}
}
