package com.qualizeal.javaapp.operation;

public abstract class Cube extends Shape3D{
	
	public double calculateVolume() {
		
		double result1 = side1 * side1 * side1;
		return result1;
	}
	
	public double calculateSurfaceArea() {
		
		double result2 = 6 * side1 * side1 * side1;
		return result2;
	}
	

}
