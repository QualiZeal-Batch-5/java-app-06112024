package com.qualizeal.javaapp.assign2;

public class Circle extends Shape {

	double radius;

	public Circle(double r) {
		radius = r;
	}

	public double getParameter() {
		return (2 * (3.14) * radius);
	}

	public double getArea() {
		return ((3.14) * radius * radius);
	}

}
