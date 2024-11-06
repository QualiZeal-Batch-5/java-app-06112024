package com.qualizeal.javaapp;

import com.qualizeal.javaapp06112024.operation.Sphere;
import com.qualizeal.javaapp06112024.operation.Cube;

public class App6 {
	public static void main(String[] args) {
		Sphere sphere = new Sphere();
		Cube cube = new Cube();
		
		double svolume1 = sphere.calculateVolume();
		double sarea1 = sphere.calculateSurfaceArea();
		
		System.out.println("Volume of Sphere : " + svolume1);
		System.out.println("Surface Area of Sphere : " + sarea1);
		
		System.out.println();
		
		double cvolume1 = cube.calculateVolume();
		double carea1 = cube.calculateSurfaceArea();
		
		System.out.println("Volume of Cube : " + cvolume1);
		System.out.println("Surface Area of Cube : " + carea1);
	}
}
