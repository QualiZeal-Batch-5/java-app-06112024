package com.qualizeal.javaapp;

import com.qualizeal.javaapp06112024.operation.Triangle;
import com.qualizeal.javaapp06112024.operation.Square;

public class App7 {
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		Square square = new Square();
		
		triangle.area();
		triangle.perimeter();
		
		System.out.println();
		
		square.area();
		square.perimeter();
	}

}
