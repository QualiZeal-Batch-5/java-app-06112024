package com.qualizeal.operation.geometricshape;

public abstract class Square extends GeometricShape{
	int side = 10;
	public double area() {
		double area = side*side;
		return area;
	}
	
	public double perimeter() {
		double perimeter = 4*side;
		return perimeter;
	}

}
