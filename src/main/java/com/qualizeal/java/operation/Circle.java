package com.qualizeal.java.operation;

public class Circle extends Shape {
	double r = 2;
	
	public double getPerimeter() {
		double perimeter =  (2*3.14*r);
		
		return perimeter;
	}
	
	public double getArea() {
		double area =  (3.14*r*r);
		
		return area;
	}
}
