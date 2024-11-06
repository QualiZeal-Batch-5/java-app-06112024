package com.qualizeal.javaapp.operation;

public class Circle extends Shape{

	public double getPerimeter() {
		double result1 = (44/7) * radius;
		return result1;
	}
	
	public double getArea() {
		double result2 = (22/7) * radius * radius;
		return result2;
	}
	
}
