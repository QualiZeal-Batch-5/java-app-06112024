package com.qualizeal.javaapp.operation2;

public class Circle extends Shape{
	double pi = 3.14;
	double r = 3;
	
	public void getPerimeter() {
		System.out.println(2*pi*r);
	}
	public void getArea() {
		System.out.println(pi*r*r);
	}
}
