package com.qualizeal.javaapp.operation;

public class Truck extends Vehicle{
	/*make, model, year, and fuel type*/
	
	public String make = "Mahindra";
	public String  model = "Thar";
	public long year = 1947;
	public String fuelType = "diesel";
	
	public double fuelEfficiency() {
		return 123.4;
	}
	
	public double distanceTraveled() {
		return 56643;
	}
	
	public double maximumSpeed() {
		return 400;
	}

}
