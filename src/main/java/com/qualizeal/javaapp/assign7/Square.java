package com.qualizeal.javaapp.assign7;

public class Square extends GeometricShape {
	double side;
	public Square(double side) {
		this.side=side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (side*side);
	}

	@Override
	public double parameter() {
		// TODO Auto-generated method stub
		return (4*side);
	}

}
