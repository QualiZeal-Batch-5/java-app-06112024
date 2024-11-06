package com.qualizeal.operation.vehicles;

public class Vehicle {
	String make = "Product:";
	int year = 0;
	String Model = "None";
	int fuel = 0;	
	
	public int fuelEfficiency() {
		return fuel;
	}
	
	public String distanceTravelled() {
		return "Distance Travelled:";
	}
	
	public int maximumSpeed() {
		return 60;
	}
	
}
