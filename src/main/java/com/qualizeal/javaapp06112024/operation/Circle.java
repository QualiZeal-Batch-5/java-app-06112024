package com.qualizeal.javaapp06112024.operation;

public class Circle extends Shape {
	
	double radius = 5;
	public double getPerimeter() {
		double result = 2 * 3.14 * radius;
		return result;
	}
	
	public double getArea() {
		double result = 3.14 * radius * radius;
		return result;
	}
}
