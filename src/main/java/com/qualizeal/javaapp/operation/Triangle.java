package com.qualizeal.javaapp.operation;

public class Triangle extends GeometricShape{
	
	public int side = 2;
	
	public int area() {
		int result1 = side * side;
		return result1;
	}
	
	public int perimeter() {
		int result2 = 4 * side;
		return result2;
	}

}
