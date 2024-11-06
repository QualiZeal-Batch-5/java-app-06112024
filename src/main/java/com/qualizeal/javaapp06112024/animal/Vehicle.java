package com.qualizeal.javaapp06112024.animal;

public class Vehicle {
	private String make;
	private String model;
	private int year;
	private String fuelType;
	
	public Vehicle(String make, String model, int year, String fuelType) {
		this.make = make;
		this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public String getFuelType() {
		return fuelType;
	}
}

