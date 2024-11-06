package com.qualizeal.javaapp06112024.operation;

public class Square extends GeometricShape {
	public void area() {
		int side = 10;
		
		System.out.println("Area of Square() = " + " " + side*side);
	}

	public void perimeter() {
		int side = 10;
		
		System.out.println("Perimeter of Square = " + " " + 4*side);
	}
}
