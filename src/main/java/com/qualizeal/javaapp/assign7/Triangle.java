package com.qualizeal.javaapp.assign7;

public class Triangle extends GeometricShape {
    double base;
    double height;
    double side;
    public Triangle(double base,double height,double side) {
    	this.base=base;
    	this.height=height;
    	this.side=side;
    }
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (0.5*base*height);
	}

	@Override
	public double parameter() {
		// TODO Auto-generated method stub
		return (3*side);
	}

}
