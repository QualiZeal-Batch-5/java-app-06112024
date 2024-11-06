package com.qualizeal.javaapp

import com.example.shapes.Circle;

public class Main {
    public static void main(String[] args) {
         Circle myCircle = new Circle(5.0);
    	
        System.out.println("Radius of the circle: " + myCircle.radius);
        
        System.out.println("Perimeter of the Circle: " + myCircle.getPerimeter());
        
        System.out.println("Area of the Circle: " + myCircle.getArea());
    }
}