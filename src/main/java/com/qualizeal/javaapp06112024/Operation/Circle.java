package com.qualizeal.javaapp06112024.Operation;

public class Circle extends Shape {
	
	public double getPerimeter(int radius) {
		double result=3.14*radius;
		return result;
	}
	public double getArea(int radius) {
		double result=3.14*radius*radius;
		return result;
		
	}


}
