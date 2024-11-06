package com.example.geometricshapes;

public class Triangle extends GeometricShape {
	private double base;
	private double height;
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(double base, double height, double sideA, double sideB, double sideC) {
		this.base = base;
		this.height = height;
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double area() {
		return 0.5* base* height;
	}

	public double perimeter() {
		return sideA + sideB + sideC;
	}
}
