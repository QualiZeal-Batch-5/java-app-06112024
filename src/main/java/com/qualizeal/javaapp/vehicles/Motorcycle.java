package com.qualizeal.javaapp.vehicles;

public class Motorcycle extends Car {
	 String make = "";
     String model = "";
     int year = 1940;
     String fuelType = "";
     
     public void fuelEfficiency() {
    	 System.out.println(" MotorcycleFuelEfficiency()");
     }
     
     public void distanceTravelled() {
    	 System.out.println("MotorcycleDistanceTravelled()");
     }
     
     public void maximumSpeed() {
 		System.out.println("MotorcycleMaximmumSpeed()");
 	}
}
