package com.qualizeal.javaapp;

import com.qualizeal.javaapp.Assignment1.*;
import com.qualizeal.javaapp.Assignment2.*;
import com.qualizeal.javaapp.Assignment3.*;
import com.qualizeal.javaapp.Assignment4.*;

public class App {
    public static void main(String[] args) {
    	
        Animal animal = new Animal();
        Cat cat = new Cat();
        
        Shape shape = new Shape();
        Circle circle = new Circle();
        
        Employee employee = new Employee();
        HRManager hrManager = new HRManager();
        
        Vehicle vehicle = new Vehicle();
        Truck truck =  new Truck();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        
        
        animal.makeSound();
        cat.makeSound();
        
        shape.getPerimeter();
        shape.getArea();
        circle.getPerimeter();
        circle.getArea();
        
        employee.work();
        employee.getSalary();
        hrManager.work();
        hrManager.addEmployee();
        
        vehicle.fuelEfficiency();
        vehicle.distanceTraveled();
        vehicle.maximumSpeed();
        truck.fuelEfficiency();
        truck.distanceTraveled();
        truck.maximumSpeed();
        car.fuelEfficiency();
        car.distanceTraveled();
        car.maximumSpeed();
        motorcycle.fuelEfficiency();
        motorcycle.distanceTraveled();
        motorcycle.maximumSpeed();
        
 
    }
}
