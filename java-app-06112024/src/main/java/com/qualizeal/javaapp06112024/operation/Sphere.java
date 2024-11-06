package com.qualizeal.javaapp06112024.operation;

public class Sphere extends Shape3D {
	public double calculateVolume() {
		int r = 10;
	
		System.out.println("CalculateVolume of Sphere() = " + " " + (4*3.14*r*r*r)/3);
		
		return (4*3.14*r*r*r)/3;
	}

	public double calculateSurfaceArea() {
		int r = 10;
		
		System.out.println("CalculateSurfaceArea of Sphere() = " +" " + 4*3.14*r*r);
		
		return 4*3.14*r*r;
	}
}
