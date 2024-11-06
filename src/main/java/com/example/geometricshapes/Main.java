package com.example.geometricshapes;

public class Main {
    public static void main(String[] args) {
        GeometricShape triangle = new Triangle(3.0, 4.0, 3.0, 4.0, 5.0);
        GeometricShape square = new Square(5.0);

        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}
