package com.qualizeal.javaapp06112024.operation;

public class Circle extends Shape {
	
	private double radius;
	
	 public Circle(double radius) {
	     this.radius = radius;
	 }

	@Override
	public double getPerimeter() {
	     return 2 * Math.PI * radius; 
	 }
	
	@Override
	public double getArea() {
		return 2 * Math.PI * radius * radius;
	}

}