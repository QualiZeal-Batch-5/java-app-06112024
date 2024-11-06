package com.qualizeal.javaapp.threedimensions;

public abstract class Cube extends Shape3D {
	public void calculateVolume() {
		System.out.println("CubeVolume");
	}

	public void calculateSurfaceArea() {
		System.out.println("CubeSurfaceArea");
	}
}
