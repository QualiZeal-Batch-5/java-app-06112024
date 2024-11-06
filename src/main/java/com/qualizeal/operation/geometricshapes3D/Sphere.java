package com.qualizeal.operation.geometricshapes3D;

public abstract class Sphere extends Shape3D{
	int radius = 10;
	public double calculateVolume() {
		double volume = 3.14*radius*radius*radius ;
		return volume;
	}
	
	public double calculateSurfaceArea() {
		double area = 3.14*radius*radius ;
		return area;
	}
}
