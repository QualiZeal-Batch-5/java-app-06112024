package com.qualizeal.javaapp.vehicles;

public class Truck extends Vehicle {
     String make = "";
     String model = "";
     int year = 2024;
     String fuelType = "";
     
     public void fuelEfficiency() {
    	 System.out.println(" TruckFuelEfficiency()");
     }
     
     public void distanceTravelled() {
    	 System.out.println("TruckDistanceTravelled()");
     }
     
     public void maximumSpeed() {
 		System.out.println("TruckMaximmumSpeed()");
 	}
    		 
}
