package com.qualizeal.javaapp;

import com.qualizeal.javaapp.operation.Cat;
import com.qualizeal.javaapp.operation2.Circle;
import com.qualizeal.javaapp.operation3.HRManager;
import com.qualizeal.javaapp.operation4.Car;
import com.qualizeal.javaapp.operation4.Motorcycle;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();

		Circle circle = new Circle();
		circle.getPerimeter();
		circle.getArea();

		HRManager hRManager = new HRManager();
		hRManager.addEmployee();
		hRManager.getSalary();
		hRManager.work();

		Motorcycle motorcycle = new Motorcycle();
		motorcycle.fuelEfficiency();
		motorcycle.distanceTravelled();
		motorcycle.maximumSpeed();

		Car car = new Car();
		car.fuelEfficiency();
		car.distanceTravelled();
		car.maximumSpeed();
	}
}
