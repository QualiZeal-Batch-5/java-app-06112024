package com.qualizeal.javaapp.assign6;

public class Cube extends Shape3D {
	double len;
	public Cube(double l) {
		len=l;
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return len*len*len;
	}

	@Override
	public double calculateSurfaceArea() {
		// TODO Auto-generated method stub
		return 6*len*len;
	}

}
