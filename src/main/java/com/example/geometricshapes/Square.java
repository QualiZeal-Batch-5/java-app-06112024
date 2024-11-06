package com.example.geometricshapes;

public class Square extends GeometricShape {
	private double sideLength;

	public Square(double sideLength) {
		this.sideLength = sideLength;
	}

	public double area() {
		return sideLength * sideLength;
	}

	public double perimeter() {
		return 4 * sideLength;
	}
}
