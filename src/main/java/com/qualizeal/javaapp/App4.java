package com.qualizeal.javaapp;

import com.qualizeal.javaapp06112024.operation.Truck;
import com.qualizeal.javaapp06112024.operation.Car;
import com.qualizeal.javaapp06112024.operation.Motorcycle;

public class App4 {
	public static void main(String[] args) {
        Truck truck = new Truck();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        
        System.out.println("Truck Make : " + truck.make);
        System.out.println("Truck Model : " + truck.model);
        System.out.println("Truck Year : " + truck.year);
        System.out.println("Truck fuel efficiency : " + truck.fuelEfficiency());
        System.out.println("Truck distance Travelled : " + truck.distanceTravelled());
        System.out.println("Truck maximum Speed : " + truck.maximumSpeed());
        
        System.out.println();
        
        System.out.println("Car Make : " + car.make);
        System.out.println("Car Model : " + car.model);
        System.out.println("Car Year : " + car.year);
        System.out.println("Car fuel efficiency : " + car.fuelEfficiency());
        System.out.println("Car distance Travelled : " + car.distanceTravelled());
        System.out.println("Car maximum Speed : " + car.maximumSpeed());
        
        System.out.println();
        
        System.out.println("Motorcycle Make : " + motorcycle.make);
        System.out.println("Motorcycle Model : " + motorcycle.model);
        System.out.println("Motorcycle Year : " + motorcycle.year);
        System.out.println("Motorcycle fuel efficiency : " + motorcycle.fuelEfficiency());
        System.out.println("Motorcycle distance Travelled : " + motorcycle.distanceTravelled());
        System.out.println("Motorcycle maximum Speed : " + motorcycle.maximumSpeed());
        
    }
}
