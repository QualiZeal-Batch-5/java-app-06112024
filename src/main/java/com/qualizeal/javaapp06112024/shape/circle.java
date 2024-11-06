package com.qualizeal.javaapp06112024.shape;

public class circle extends shape {

	private double radius;

	public circle(double radius) {
		this.radius = radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
