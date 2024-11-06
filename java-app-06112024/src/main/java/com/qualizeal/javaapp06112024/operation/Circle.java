package com.qualizeal.javaapp06112024.operation;

public class Circle extends Shape {
	double radius = 6.5;
	public double getPerimeter() {
		return 2 * 3.14* radius;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}

}
