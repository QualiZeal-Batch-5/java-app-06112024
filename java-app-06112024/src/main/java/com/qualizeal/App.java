package com.qualizeal;

import com.qualizeal.javaapp06112024.operation.*;

public class App {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();
		
		Circle circle = new Circle();
		double result1 = circle.getPerimeter();
		double result2 = circle.getArea();
		
		System.out.println(result1);
		System.out.println(result2);
		
		HRManager hRManager = new HRManager();
		hRManager.work();
		String result3 = hRManager.addEmployee();
		
		System.out.println(result3);
		
		Truck truck = new Truck("Tata", "Tata Winger", 2018, "Petrol");
		Car car = new Car("Hyundai", "Creta", 2015, "Diesel");
		Motorcycle motorcycle = new Motorcycle("Hero Honda", "Pulsar", 2010, "Petrol");
		
		Truck[] truck1 = {truck};
		Car[] car1 = {car};
		Motorcycle[] motorcycle1 = {motorcycle}; 
		
		for (Truck truck2 : truck1) {
			System.out.print(truck2.fuelEfficiency() + "  ");
			System.out.print(truck2.distance() + "  ");
			System.out.print(truck2.maximumSpeed() + "  ");
			System.out.println();
		}
		
		for (Car car2 : car1) {
			System.out.print(car2.fuelEfficiency() + "  ");
			System.out.print(car2.distance() + "  ");
			System.out.print(car2.maximumSpeed() + "  ");
			System.out.println();
		}
		
		for (Motorcycle motorcycle2 : motorcycle1) {
			System.out.print(motorcycle2.fuelEfficiency() + "  ");
			System.out.print(motorcycle2.distance() + "  ");
			System.out.print(motorcycle2.maximumSpeed() + "  ");
			System.out.println();
		}
		
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.deposit();
		savingsAccount.withdraw();
		
		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.deposit();
		currentAccount.withdraw();
		
		Sphere sphere = new Sphere();
		sphere.calculateVolume();
		sphere.calculateSurfaceArea();
		
		Cube cube = new Cube();
		cube.calculateVolume();
		cube.calculateSurfaceArea();
		
		Triangle triangle = new Triangle();
		triangle.area();
		triangle.perimeter();
		
		Square square = new Square();
		square.area();
		square.perimeter();
	}

}
