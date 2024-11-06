package com.qualizeal.javaapp;

import com.qualizeal.javaapp.animal.*;
public class App {
    public static void main(String[] args) {
    	 Cat cat = new Cat();
       System.out.println("cat sound meow");
       
   	Circle circle = new Circle(8.0);
	
	 System.out.println("Circle with radius: " + circle.getPerimeter() + " has perimeter (circumference) of: " + circle.getPerimeter());
    System.out.println("Circle with radius: " + circle.getArea() + " has area of: " + circle.getArea());
   	
    }
}
