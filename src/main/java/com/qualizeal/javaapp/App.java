package com.qualizeal.javaapp;

import com.qualizeal.javaapp06112024.operation.Truck;
import com.qualizeal.javaapp06112024.operation.Car;
import com.qualizeal.javaapp06112024.operation.MotorCycle;



public class App {
    public static void main(String[] args) {
    
    	        Truck truck = new Truck("Ford", "F-150", 2020, "Gasoline", 2.5);
    	        Car car = new Car("Toyota", "Camry", 2022, "Hybrid", 4);
    	        MotorCycle motorCycle = new MotorCycle("Harley-Davidson", "Iron 883", 2021, "Gasoline", true);

    	        
    	        System.out.println("Truck: " + truck.getMake() + " " + truck.getModel());
    	        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " MPG");
    	        System.out.println("Distance with 10 gallons: " + truck.calculateDistance(10) + " miles");
    	        System.out.println("Max Speed: " + truck.calculateMaxSpeed() + " mph\n");

    	        
    	        System.out.println("Car: " + car.getMake() + " " + car.getModel());
    	        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " MPG");
    	        System.out.println("Distance with 10 gallons: " + car.calculateDistance(10) + " miles");
    	        System.out.println("Max Speed: " + car.calculateMaxSpeed() + " mph\n");

    	        
    	        System.out.println("Motorcycle: " + motorCycle.getMake() + " " + motorCycle.getModel());
    	        System.out.println("Fuel Efficiency: " + motorCycle.calculateFuelEfficiency() + " MPG");
    	        System.out.println("Distance with 10 gallons: " + motorCycle.calculateDistance(10) + " miles");
    	        System.out.println("Max Speed: " + motorCycle.calculateMaxSpeed() + " mph");
    	    }
    	}
    	