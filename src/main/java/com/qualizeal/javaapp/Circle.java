package com.qualizeal.javaapp;

public class Circle extends Shape {
	
private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;  // Formula: 2 * π * r
    }

    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);  // Formula: π * r^2
    }

    
    public double getRadius() {
        return radius;
    }
}




    