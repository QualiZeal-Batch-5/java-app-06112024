package com.qualizeal.javaapp06112024.operation;

public class Cube extends Shape3D {
	public double calculateVolume() {
		int a = 10;
		
		System.out.println("CalculateVolume of Cube() =" + " " + a*a*a);
		
		return a*a*a;
	}

	public double calculateSurfaceArea() {
		int a = 10;
		
		System.out.println("CalculateSurfaceArea of Cube() =" + " " + 6*a*a);
		
		return 6*a*a;
	}
}
