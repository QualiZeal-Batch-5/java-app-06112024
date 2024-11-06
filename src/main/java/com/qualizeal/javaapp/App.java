package com.qualizeal.javaapp;

import com.qualizeal.javaapp6112024.employees.HRManager;
import com.qualizeal.javaapp6112024.operation.animal.Cat;
import com.qualizeal.javaapp6112024.operation.shapes.Circle;

public class App {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();

		Circle circle = new Circle();
		
		double perimeter = circle.getPerimeter();
		System.out.println("Perimeter of Circle:" + perimeter);
		
		double ar = circle.getArea();
		System.out.println("Area of Circle:" + ar);

		HRManager hRManager = new HRManager();
		hRManager.work();
		hRManager.addEmployee();

	}
}
