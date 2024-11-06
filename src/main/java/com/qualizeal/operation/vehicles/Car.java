package com.qualizeal.operation.vehicles;

public class Car extends Vehicle{
	String make = "Steel";
	int year = 2024;
	String Model = "Maruthi";
	int fuel = 20;
	
	public int fuelEfficiency() {
		return fuel;
	}
	
	public String distanceTravelled() {
	    return "Distance Travelled by Car:50kms";
	
	}
	
	public int maximumSpeed() {
		return 60;
	}
}
