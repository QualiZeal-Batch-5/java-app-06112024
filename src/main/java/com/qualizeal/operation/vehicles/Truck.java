package com.qualizeal.operation.vehicles;

public class Truck extends Vehicle{
	String make = "Iron";
	int year = 2020;
	String Model = "Motors";
	int fuel = 100;
	
	public int fuelEfficiency() {
		return fuel;
	}
	
	public String distanceTravelled() {
	    return "Distance Travelled by Truck:1000kms";
	
	}
	
	public int maximumSpeed() {
		return 60;
	}
}
