package com.qualizeal.javaapp06112024;

public class Circle extends Shape {

	double radius = 2.0;

	public double getArea() {

		return 3.14 * (radius) * (radius);
	}

	public double getPerimeter() {

		return 2 * 3.14 * radius;
	}

}
