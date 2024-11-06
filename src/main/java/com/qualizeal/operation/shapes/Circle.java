package com.qualizeal.operation.shapes;

public class Circle extends Shape {
	int radius = 10;
	public double getPerimeter() {
	    double  perimeter = 2*3.14*radius;
		System.out.println("Perimeter of Circle:");
		return perimeter;
		
	}
	
	public double getArea() {
	    double area = 3.14*radius*radius;
		System.out.println("Area of Circle:");
		return area;
	}
}
