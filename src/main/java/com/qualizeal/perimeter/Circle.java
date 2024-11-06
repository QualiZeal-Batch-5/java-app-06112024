package com.qualizeal.perimeter;

public class Circle extends Shape {
	public double radius = 4.2;
	
	public double getPerimeter() {
		double result;
		result = 2 * 3.14 * radius;
		System.out.println("Perimeter = "+ result);
		return result;
	}
	
	public double getArea() {
		
		double result1;
		result1 = 3.14 * radius * radius;
		System.out.println("Area = "+ result1);
		return result1;
	}
}