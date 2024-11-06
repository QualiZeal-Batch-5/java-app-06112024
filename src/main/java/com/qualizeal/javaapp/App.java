package com.qualizeal.javaapp;

import com.qualizeal.javaapp06112024.operation.Cat;
import com.qualizeal.javaapp06112024.operation2.Circle;
import com.qualizeal.javaapp06112024.operation3.Employee;
import com.qualizeal.javaapp06112024.operation3.HRManager;
import com.qualizeal.javaapp06112024.operation4.Car;
import com.qualizeal.javaapp06112024.operation4.Motorcycle;
import com.qualizeal.javaapp06112024.operation4.Truck;
import com.qualizeal.javaapp06112024.operation4.Vehicle;

public class App {
	public static void main(String[] args) {
        //operation1
		Cat cat = new Cat();
		cat.makeSound();
		
		//operation2

		Circle circle = new Circle(5.0);

		double perimeter = circle.getPerimeter();
		System.out.println("Perimeter of the circle: " + perimeter);

		double area = circle.getArea();
		System.out.println("Area of the circle: " + area);
		
		//operation3
		Employee emp = new Employee(50000);
		emp.work();
		System.out.println("Employee Salary: " + emp.getSalary());

		HRManager hrManager = new HRManager(70000);
		hrManager.work();
		hrManager.addEmployee("John Doe");
		System.out.println("HR Manager Salary: " + hrManager.getSalary());
		
		//operation4

		Truck truck = new Truck("Ford", "F-150", 2023, 3);
		System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
		System.out
				.println("Distance Traveled with 100 liters of fuel: " + truck.calculateDistanceTraveled(100) + " km");
		System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h\n");

		
		Car car = new Car("Toyota", "Camry", 2023, 4);
		System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
		System.out.println("Distance Traveled with 50 liters of fuel: " + car.calculateDistanceTraveled(50) + " km");
		System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h\n");

		
		Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2023, 6);
		System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " km/l");
		System.out.println(
				"Distance Traveled with 20 liters of fuel: " + motorcycle.calculateDistanceTraveled(20) + " km");
		System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " km/h");

	}
}
