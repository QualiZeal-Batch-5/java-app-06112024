package com.qualizeal.javaapp.operation4;

public class Car extends Vehicle{
	String model = "ZDI";
	int year = 2022;
	String fuel = "Petrol";
	String make = "KIA";
	
	
	public void fuelEfficiency() {
		System.out.println("fuelefficiency from Car");
	}
	
	public void distanceTravelled() {
		System.out.println("distanceTravelled from Car");
	}
	
	public void maximumSpeed() {
		System.out.println("maximumSpeed from Car");
	}
}
