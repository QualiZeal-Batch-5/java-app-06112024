package com.qualizeal.javaapp.vehicle;

public class Truck extends Vehicle{
	int make;
	String model;
	int year;
	String fuelType;
	@Override
	public int distancetraveled() {
		// TODO Auto-generated method stub
		//return super.distancetraveled();
		System.out.println("distancetraveled from Truck");
		return 0;
	}
	
	@Override
	public int maximumspeed() {
		// TODO Auto-generated method stub
		//return super.maximumspeed();
		System.out.println("maximumspeed from Truck");
		return 0;
	}
	
	@Override
	public int fuelefficiency() {
		// TODO Auto-generated method stub
		//return super.fuelefficiency();
		System.out.println("fuelefficiency from Truck");
		return 0;
	}
}
