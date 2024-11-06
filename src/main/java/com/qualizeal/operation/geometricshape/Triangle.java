package com.qualizeal.operation.geometricshape;

public abstract class Triangle extends GeometricShape {
	int radius = 10;
	public double area() {
		double area = 1/3*3.14*radius*radius;
		return area;
	}
	
	public double perimeter() {
		double perimeter = 2*3.14*radius;
		return perimeter;
	}
}
