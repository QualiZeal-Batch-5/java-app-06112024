package com.qualizeal.javaapp.operation4;

public class Motorcycle extends Vehicle {
	String model = "ZDI";
	int year = 2023;
	String fuel = "Petrol";
	String make = "HONDA";

	public void fuelEfficiency() {
		System.out.println("fuelefficiency from Motorcycle");
	}

	public void distanceTravelled() {
		System.out.println("distanceTravelled from Motorcycle");
	}

	public void maximumSpeed() {
		System.out.println("maximumSpeed from Motorcycle");
	}
}
