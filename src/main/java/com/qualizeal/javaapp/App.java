package com.qualizeal.javaapp;

public class App {
	public static void main(String[] args) {

		Animal myAnimal = new Animal();
		myAnimal.makeSound();

		Animal myCat = new Cat();
		myCat.makeSound();
		Circle myCircle = new Circle(5.0);
		System.out.println(myCircle.getPerimeter());
		System.out.println(myCircle.getArea());
		Employee generalEmployee = new Employee();
		generalEmployee.work();
		System.out.println("General employee salary: " + generalEmployee.getSalary());

		HRManager hrManager = new HRManager();
		hrManager.work();
		System.out.println("HR Manager salary: " + hrManager.getSalary());

		hrManager.addEmployee();
		Truck truck = new Truck("Ford", "F-150", 2022, "Diesel", 10);
		Car car = new Car("Toyota", "Camry", 2021, "Gasoline", 5);
		Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2020, "Gasoline", false);

		double fuelUsed = 10.0;

		System.out.println("Truck: " + truck.make + " " + truck.model);
		System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " MPG");
		System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled(fuelUsed) + " miles");
		System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

		System.out.println("Car: " + car.make + " " + car.model);
		System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " MPG");
		System.out.println("Distance Traveled: " + car.calculateDistanceTraveled(fuelUsed) + " miles");
		System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");

		System.out.println("Motorcycle: " + motorcycle.make + " " + motorcycle.model);
		System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " MPG");
		System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTraveled(fuelUsed) + " miles");
		System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph\n");
	}
}
