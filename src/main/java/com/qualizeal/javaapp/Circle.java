package com.qualizeal.javaapp;

public class Circle extends Shape {
	
    double radius;
    
    double Pi=3.14;

    public Circle(double radius) {
    	
        this.radius = radius;
       
    }

    public double getPerimeter() {
    	
    	return 2 * Pi * radius; 
    	
    }

    public double getArea() {
    	
        return Pi * radius * radius; 
        
    }
}