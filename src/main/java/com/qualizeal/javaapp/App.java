package com.qualizeal.javaapp;

import com.qualizeal.java.operation.Animal;
import com.qualizeal.java.operation.Car;
import com.qualizeal.java.operation.Cat;
import com.qualizeal.java.operation.Circle;
import com.qualizeal.java.operation.HRManager;
import com.qualizeal.java.operation.Motorcycle;
import com.qualizeal.java.operation.Truck;

public class App {
    public static void main(String[] args) {
    	Animal animal = new Animal();
    	Cat cat = new Cat();
    	animal.makeSound();
    	cat.makeSound();
    	
   
    	Circle circle = new Circle();
    	double result1 = circle.getPerimeter();
    	double result2 = circle.getArea();
    	System.out.println(result1);
    	System.out.println(result2);
    	
    	
    	HRManager hrmanager = new HRManager();
    	hrmanager.work();
    	hrmanager.addEmployee();
    	hrmanager.getSalary();
    	
    	Truck truck = new Truck();
    	Car car = new Car();
    	Motorcycle motorcycle = new Motorcycle();
    	String fueltype = truck.fueltype;
    	System.out.println(fueltype);
    	int make = truck.make;
    	System.out.println(make);
    	String model = truck.model;
    	System.out.println(model);
    	
    	
    	
    	
    }
}
