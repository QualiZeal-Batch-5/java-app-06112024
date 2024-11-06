package com.qualizeal.javaapp06112024;

public abstract class Cube extends Shape3D {
	double side = 4.7;

	public double calculateVolume() {
		return side * side * side;
	}

	public double calculateSurfaceArea() {
		return 6 * side * side;
	}

}
