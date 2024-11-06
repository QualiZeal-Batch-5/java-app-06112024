package com.qualizeal.javaapp06112024;

public class Truck extends Vehicle {

	String Make, Model, fuel, fuel_Type;
	double distance_Traveled, fuelUsed, maxSpeed;

	public double get_Distance_Traveled() {
		return distance_Traveled;
	}

	public double calculate_Fuel_Efficiency() {

		double fuelEfficiency = (distance_Traveled / fuelUsed);
		return fuelEfficiency;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}
}
