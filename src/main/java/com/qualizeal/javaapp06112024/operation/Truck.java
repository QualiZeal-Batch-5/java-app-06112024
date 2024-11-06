package com.qualizeal.javaapp06112024.operation;

public class Truck extends Vehicle{
	public String make = "Mahindra";
	public String model = "abcd";
	public int year = 2010;
	public String fuelType = "petrol";
	
	public String fuelEfficiency() {
		if(fuelType == "petrol") {
			return "Efficient.";
		}
		else {
			return "Not Efficient.";
		}
	}
	
	public double distanceTravelled() {
		return 100000.31;
	}
	
	public double maximumSpeed() {
		return 120.0;
	}
}
