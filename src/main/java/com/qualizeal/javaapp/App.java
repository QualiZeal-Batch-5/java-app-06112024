package com.qualizeal.javaapp;

import com.qualizeal.javaapp06112024.animal.Animal;
import com.qualizeal.javaapp06112024.animal.Cat;
import com.qualizeal.javaapp06112024.animal.Circle;
import com.qualizeal.javaapp06112024.animal.Employee;
import com.qualizeal.javaapp06112024.animal.HRManager;
import com.qualizeal.javaapp06112024.animal.Vehicle;
import com.qualizeal.javaapp06112024.animal.Truck;

public class App {
    public static void main(String[] args) {
    	Animal animal = new Animal();
        animal.makeSound();
       
        Animal cat = new Cat();  
        cat.makeSound();
        
        //Circle
        Circle circle = new Circle(5.0);
       
        System.out.println("Circle with radius " + circle.getRadius() + ":");
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
        
        //Employee Class
        Employee employee = new Employee("Lahari", 30000);
        System.out.println(employee.getName() + " salary: " + employee.getSalary());
        employee.work();
        
        HRManager hrManager = new HRManager("Arvind", 1000000);
        
        System.out.println(hrManager.getName() + " salary: " + hrManager.getSalary());
        
        hrManager.work();
        hrManager.addEmployee("Steven");
        
        //Vehicle
        Vehicle truck = new Truck("Godzilla", "F-150", 2024, "Gasoline");
        
        
    }
}
