package com.qualizeal.javaapp.operation;

public abstract class Sphere extends Shape3D{
	
	public double calculateVolume() {
		
		double result1 = (4/3) * (22/7) * radius * radius;
		return result1;
	}
	
	public double calculateSurfaceArea() {
		
		double result2 = (4) * (22/7) * radius * radius;
		return result2;
	}

}
