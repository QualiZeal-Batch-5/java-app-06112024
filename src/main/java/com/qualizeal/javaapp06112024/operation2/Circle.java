package com.qualizeal.javaapp06112024.operation2;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
        this.radius = radius;
    }

	
	public double getPerimeter() {
		return 2*1.41*radius;
	}
	
	public double getArea() {
		return 1.41*radius*radius;
	}
}
