package com.qualizeal.javaapp.geometricshapes;

public class Triangle extends GeometricShape{
	int side1 = 1, base = 2, side2 = 3, height = 4;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Triangle is : " + ((base * height)/2));
		
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("perimeter of Triangle is : " + (side1 + base + side2));
	}

}
