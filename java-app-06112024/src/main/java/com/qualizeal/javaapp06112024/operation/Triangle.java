package com.qualizeal.javaapp06112024.operation;

public class Triangle extends GeometricShape {
	public void area() {
		int base = 10;
		int height = 10;
		
		System.out.println("Area of Triangle() = " + " " + (base*height)/2);
	}

	public void perimeter() {
		int a = 10;
		int b = 10;
		int c = 10;
		
		System.out.println("Perimeter of Triangle = " + " " + (a+b+c));
	}
}
