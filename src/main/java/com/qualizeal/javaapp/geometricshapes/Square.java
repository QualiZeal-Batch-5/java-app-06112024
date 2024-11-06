package com.qualizeal.javaapp.geometricshapes;

public class Square extends GeometricShape{
	int squareSide = 3;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Square is : " + (squareSide * squareSide));
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Square is : " + (squareSide * 4));
	}

}
