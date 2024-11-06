package com.qualizeal.javaapp;

import com.qualizeal.javaapp.assign1.*;
import com.qualizeal.javaapp.assign2.*;
import com.qualizeal.javaapp.assign3.*;
import com.qualizeal.javaapp.assign4.*;
import com.qualizeal.javaapp.assign5.*;
import com.qualizeal.javaapp.assign6.*;
import com.qualizeal.javaapp.assign7.*;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {

		Cat cat = new Cat();
		cat.makeSound();

		Circle circle = new Circle(6);
		System.out.println(circle.getParameter());
		System.out.println(circle.getArea());

		HRManager hRManager = new HRManager();
		hRManager.addEmployee();
		hRManager.work();

		Car car = new Car("x", "y", 2010, "deiseal");
		System.out.println(car.distanceTraveled());
		System.out.println(car.fuelEfficiency());
		System.out.println(car.maximumSpeed());

		Truck truck = new Truck("a", "b", 2010, "deiseal");
		System.out.println(truck.distanceTraveled());
		System.out.println(truck.fuelEfficiency());
		System.out.println(truck.maximumSpeed());

		MotorCycle motorCycle = new MotorCycle("yx", "yz", 2010, "petrol");
		System.out.println(motorCycle.distanceTraveled());
		System.out.println(motorCycle.fuelEfficiency());
		System.out.println(motorCycle.maximumSpeed());

		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.deposit();
		currentAccount.withDraw();

		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.deposit();
		savingsAccount.withDraw();

		Cube cube = new Cube(8);
		System.out.println(cube.calculateSurfaceArea());
		System.out.println(cube.calculateVolume());

		Sphere sphere = new Sphere(15);
		System.out.println(sphere.calculateSurfaceArea());
		System.out.println(sphere.calculateVolume());

		Square square = new Square(5);
		System.out.println(square.area());
		System.out.println(square.parameter());

		Triangle triangle = new Triangle(5, 4, 8);
		System.out.println(triangle.area());
		System.out.println(triangle.parameter());

	}
}
