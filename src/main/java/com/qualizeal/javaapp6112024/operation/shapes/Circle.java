package com.qualizeal.javaapp6112024.operation.shapes;

public class Circle extends Shape {
	int radius = 10;

	public double getPerimeter() {
		double perimeter = 2 * 3.14 * radius;
		
		return perimeter;

	}

	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}

}
