package com.qualizeal.javaapp06112024.operation;

public class Sphere extends Shape3D{
	double radius = 10.0;
	
	public double calculateVolume() {
		double volume = 0.0;
		volume = (4/3) * 3.14 * radius;
		
		return volume;
	}
	
	public double calculateSurfaceArea() {
		double area = 0.0;
		area = 4 * 3.14 * radius * radius;
		
		return area;
	}
}
