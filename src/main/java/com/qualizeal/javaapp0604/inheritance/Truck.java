package com.qualizeal.javaapp0604.inheritance;

/*The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. 
Each subclass should have properties such as make, model, year, and fuel type. 
Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.*/

public class Truck {
	int make = 2001;
	String model = "T-Cross";
	int year = 2024;
	String fuelType = "Diesel";
	
	public void fuelEfficiency() {
		System.out.println("Fuel Efficiency of the Truck");
	}
	
	public void distanceTravelled() {
		System.out.println("Distance travelled by the Truck");
	}
	
	public void maximumSpeed() {
		System.out.println("Maximum Speed of the Truck");
	}
}
