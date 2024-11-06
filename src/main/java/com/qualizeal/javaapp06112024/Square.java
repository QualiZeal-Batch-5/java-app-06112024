package com.qualizeal.javaapp06112024;

public class Square extends GoemetricShape {
	
	double side = 4;
	
	public double area() {

		return side*side;

	}

	public double perimeter() {

		double peri = 4*side;
		return peri;
	}

}
