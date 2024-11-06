package com.qualizeal.javaapp061120244;

public class App {
    public void main(String[] args) {
    	
    	Vehicle vehicle = new Vehicle();
    	Car car = new Car();
    	Truck truck = new Truck();
    	Motorcycle motorcycle = new Motorcycle();
    	
    	System.out.println(car.getFuel());
    	System.out.println(truck.make());
    	System.out.println(vehicle.getDistance());
    	System.out.println(motorcycle.getYear());
    	
  
    }
}

