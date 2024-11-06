package com.qualizeal.javaapp;

import java.util.Currency;

import com.qualizeal.javaapp06112024.operation.Animal;
import com.qualizeal.javaapp06112024.operation.Car;
import com.qualizeal.javaapp06112024.operation.Cat;
import com.qualizeal.javaapp06112024.operation.Circle;
import com.qualizeal.javaapp06112024.operation.CurrentAccount;
import com.qualizeal.javaapp06112024.operation.Employee;
import com.qualizeal.javaapp06112024.operation.HRManager;
import com.qualizeal.javaapp06112024.operation.Motorcycle;
import com.qualizeal.javaapp06112024.operation.SavingsAccount;
import com.qualizeal.javaapp06112024.operation.Truck;
import com.qualizeal.javaapp06112024.operation.Vehicle;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        
        Cat cat = new Cat();
        cat.makeSound();
    	
    	Circle circle = new Circle();
    	System.out.println(circle.getArea());
    	System.out.println(circle.getPerimeter());
    	
    	Employee employee = new Employee();
    	employee.work();
    	
    	HRManager hrManager = new HRManager();
    	hrManager.work();
    	System.out.println(hrManager.getSalary());
    	hrManager.addEmployee();
    	
    	
    	Truck truck = new Truck("Ford", "F-150", 2022, "Gasoline");
    	System.out.println(truck.distanceTraveled());
    	
    	Car car = new Car("Tata" ,"nano" ,2024 ,"Hybrid");
    	System.out.println(car.fuelEfficiency());
    	
    	Motorcycle motorcycle = new Motorcycle(null, null, 0, null);
    	System.out.println(motorcycle.maximumSpeed());
    	
    	SavingsAccount savingsAccount = new SavingsAccount();
    	savingsAccount.deposit();
    	savingsAccount.withdraw();
    	
    	CurrentAccount currentAccount = new CurrentAccount();
    	currentAccount.deposit();
    	currentAccount.withdraw();
    }
}
