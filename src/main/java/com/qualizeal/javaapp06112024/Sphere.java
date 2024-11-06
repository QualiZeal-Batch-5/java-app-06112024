package com.qualizeal.javaapp06112024;

public class Sphere extends Shape3D {
	double radius = 3.6;

	public double calculateVolume() {
		return (4 / 3) * (3.14) * (radius) * (radius) * (radius);
	}

	public double calculateSurfaceArea() {
		return 4 * 3.14 * radius * radius;
	}

}
