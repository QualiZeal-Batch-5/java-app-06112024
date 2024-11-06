package com.qualizeal.javaapp06112024.operation;

public class Circle extends Shape{
	double radius = 5;
	public double getPerimeter() {
		double perimeter;
		
		perimeter  = 2 * 3.14 * radius;
		
		return perimeter;
	}
	
	public double getArea() {
		double area;
		
		area = 3.14 * radius * radius;
		
		return area;
	}
}
