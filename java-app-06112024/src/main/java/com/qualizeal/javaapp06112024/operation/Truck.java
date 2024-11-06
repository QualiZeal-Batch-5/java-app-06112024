package com.qualizeal.javaapp06112024.operation;

public class Truck extends Vehicle{
	private String make;
	private String model;
	private long year;
	private String fuelType;
	
	public Truck() {
		
	}
	
	public Truck(String make, String model, long year, String fuelType) {
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
	
	public long getYear() {
		return year;
	}
	
	public String getFuelType() {
		return fuelType;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(long year) {
		this.year = year;
	}
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	public double fuelEfficiency() {
		return 98.8;
	}
	
	public double distance() {
		return 503.5;
	}
	
	public long maximumSpeed() {
		return 140;
	}
}
