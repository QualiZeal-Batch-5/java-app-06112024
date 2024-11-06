package com.qualizeal.Javaapp06112024.programm;

public class Circle extends Shape{
	public void getPerimeter(int radius) {
		super.getPerimeter(3);
		double result1 = 2*3.14*radius;
		System.out.println("Perimeter of the circle is " + result1);
	}
	public void getArea(int radius) {
		super.getArea(3);
		double result2 = 3.14*radius*radius;
		System.out.println("Area of the circle is " + result2);
	}
}
