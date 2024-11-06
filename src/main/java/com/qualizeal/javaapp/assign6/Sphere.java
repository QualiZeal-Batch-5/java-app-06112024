package com.qualizeal.javaapp.assign6;

public class Sphere extends Shape3D {
	double radius;
	public Sphere(double radius) {
		this.radius=radius;
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return ((4/3)*(3.14)*radius*radius*radius);
	}

	@Override
	public double calculateSurfaceArea() {
		// TODO Auto-generated method stub
		return (4*(3.14)*radius*radius);
	}

}
