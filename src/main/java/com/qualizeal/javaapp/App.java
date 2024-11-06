package com.qualizeal.javaapp;


import com.qualizeal.javaapp.operation.Cat;
import com.qualizeal.javaapp.operation.Circle;
import com.qualizeal.javaapp.operation.HRManager;
import com.qualizeal.javaapp.operation.Truck;
import com.qualizeal.javaapp.operation.Car;
import com.qualizeal.javaapp.operation.Motorcycle;
import com.qualizeal.javaapp.operation.Sphere;
import com.qualizeal.javaapp.operation.Cube;
import com.qualizeal.javaapp.operation.Triangle;
import com.qualizeal.javaapp.operation.Square;



public class App {
    public static void main(String[] args) {
        
    	Cat cat = new Cat();
    	String res1 = cat.makeSound();
    	
    	Circle circle = new Circle();
    	double res2 = circle.getPerimeter();
    	double res3 = circle.getArea();
    	
    	HRManager hRManager = new HRManager();
    	String res4 = hRManager.work();
    	int res5 = hRManager.addEmployee();
    	double res6 = hRManager.getSalary();
    	
    	
    	Truck truck = new Truck();
    	double res7 = truck.fuelEfficiency();
    	double res8 = truck.distanceTraveled();
    	double res9 = truck.maximumSpeed();
    	
    	Car car = new Car();
    	double res10 = car.fuelEfficiency();
    	double res11 = car.distanceTraveled();
    	double res12 = car.maximumSpeed();
    	
    	Motorcycle motorcycle = new Motorcycle();
    	double res13 = motorcycle.fuelEfficiency();
    	double res14 = motorcycle.distanceTraveled();
    	double res15 = motorcycle.maximumSpeed();
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
