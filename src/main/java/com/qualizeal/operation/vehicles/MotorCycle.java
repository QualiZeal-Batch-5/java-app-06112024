package com.qualizeal.operation.vehicles;

public class MotorCycle extends Vehicle {
	String make = "Rubber";
	int year = 2024;
	String Model = "New";
	int fuel = 20;
	
	public int fuelEfficiency() {
		return fuel;
	}
	
	public String distanceTravelled() {
	    return "Distance Travelled by MotorCycle:100kms";
	
	}
	
	public int maximumSpeed() {
		return 60;
	}
}
