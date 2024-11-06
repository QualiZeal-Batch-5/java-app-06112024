package com.qualizeal.javaapp.operation;

public class Square extends GeometricShape{
	
	public int base = 3;
	public int height =4; 
	public int hyp = 5;
	
	public int area() {
		int result1 = (1/2) * base * height;
		return result1;
	}
	
	public int perimeter() {
		int result2 = base + height + hyp;
		return result2;
	}
}
