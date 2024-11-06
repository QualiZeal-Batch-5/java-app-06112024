package com.qualizeal.javaapp;
 
abstract class Shape {
	
    public abstract double getPerimeter();
    
    public abstract double getArea();
    
}
 
class Circle extends Shape {
	
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