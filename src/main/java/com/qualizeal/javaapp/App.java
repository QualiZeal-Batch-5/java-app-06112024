package com.qualizeal.javaapp;


public class App {
	
    public static void main(String[] args) {
        
    	Animal animal = new Animal();
        animal.makeSound();  

        
        Cat cat = new Cat();
        cat.makeSound();  
        
        
//  This is shape and circle classes output 
        
        
        Circle circle = new Circle(5.0);

        
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        
        
//  This is Employee and HRManager classes output 
        
        
        HRManager hrManager = new HRManager("Sushma", 80000);
        
        hrManager.work();
        
        hrManager.addEmployee("Harshitha");
        hrManager.addEmployee("Vijaya");
        hrManager.addEmployee("Hari");
        
        System.out.println("Salary of " + hrManager.getName()+" : "+ hrManager.getSalary());
    }
    
}

