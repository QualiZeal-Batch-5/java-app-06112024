package com.qualizeal.javaapp06112024.operation;

public class Cube extends Shape3D{
double radius = 15.0;
	
	public double calculateVolume() {
		double volume = 0.0;
		volume = radius * radius * radius;
		
		return volume;
	}
	
	public double calculateSurfaceArea() {
		double area = 0.0;
		area = 6 * radius * radius;
		
		return area;
	}
}
