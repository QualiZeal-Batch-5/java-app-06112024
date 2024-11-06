package com.qualizeal.javaapp06112024;

public class Triangle extends GoemetricShape {
	double height, base;
	double a, b, c;

	public double area() {

		return 0.5 * height * base;

	}

	public double perimeter() {

		double peri = (a + b + c) / 2;
		return peri;
	}

}
