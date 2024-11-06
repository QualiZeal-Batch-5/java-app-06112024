package com.qualizeal.javaapp;

import com.qualizeal.javaapp06112024.operation.Animal;
import com.qualizeal.javaapp06112024.operation.Cat;
import com.qualizeal.javaapp06112024.operation.Shape;
import com.qualizeal.javaapp06112024.operation.Circle;




 class App {
    public static void main(String[] args) {
    	Animal animal = new Animal();
		String result = animal.makeSound();
		System.out.println(result);

    	Cat cat = new Cat();
		String result1 = cat.makeSound();
		System.out.println(result1);  
		
        Shape myCircle = new Circle(5.0);
        
        System.out.println(myCircle.getPerimeter());
        System.out.println(myCircle.getArea());  
        
        Employee myEmployee = new Employee();
        Employee myHRManager = new HRManager();
        
        myEmployee.work();
        myEmployee.getSalary();
        myHRManager.work();
        myHRManager.addEmployee();
        }
}
