package com.qualizeal.javaapp.shape3d;

public abstract class Shape3D {
	public Shape3D() {
		System.out.println("Shape3D().");
	}
	public abstract void calculateVolume();
	
	public abstract void calculateSurfaceArea();
}
