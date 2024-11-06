package com.qualizeal.javaapp.vehicles;

public class Car extends Vehicle {
	 String make = "";
     String model = "";
     int year = 1980;
     String fuelType = "";
     
     public void fuelEfficiency() {
    	 System.out.println(" CarFuelEfficiency()");
     }
     
     public void distanceTravelled() {
    	 System.out.println("CarDistanceTravelled()");
     }
     
     public void maximumSpeed() {
 		System.out.println("CarMaximmumSpeed()");
 	}
}
