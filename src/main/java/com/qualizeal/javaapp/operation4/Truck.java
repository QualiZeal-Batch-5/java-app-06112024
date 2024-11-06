package com.qualizeal.javaapp.operation4;

public class Truck extends Vehicle{
	String model = "VDI";
	int year = 2020;
	String fuel = "Diesel";
	String make = "TATA";
	
	public void fuelEfficiency() {
		System.out.println("fuel is used efficiently");
	}
	
	public void distanceTravelled() {
		System.out.println("distanceTravelled from Truck");
	}
	
	public void maximumSpeed() {
		System.out.println("maximumSpeed from Truck");
	}
	
}
