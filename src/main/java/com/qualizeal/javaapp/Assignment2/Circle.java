package com.qualizeal.javaapp.Assignment2;

public class Circle extends Shape {
	double r = 3;
	double pi = 3.14;
	

	public void getPerimeter() {
		double perimeter = 2 * pi * r;
		System.out.println(perimeter);	
	}
	
	public void getArea() {
		double area = pi * r * r;
		System.out.println(area);
		
		
	}
}
