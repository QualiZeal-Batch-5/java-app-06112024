package com.qualizeal.javaapp;

import com.qualizeal.javaapp06112024.operation.Circle;

public class App2 {
	public static void main(String[] args) {
        Circle circle = new Circle();
        
        double perimeter1 = circle.getPerimeter();
        double area1 = circle.getArea();
        
        System.out.println(perimeter1);
        System.out.println(area1);
    }
}
