package com.qualizeal.javaapp06112024.operation;

public class Circle extends Shape {
	public double radius;
	public Circle(double radius) {
		this.radius = radius;
		
		
		
	}
	
	public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
	
	public double getArea() {
		return Math.PI * radius * radius;
		
		
	}

}
