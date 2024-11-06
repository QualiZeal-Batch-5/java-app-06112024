package com.qualizeal.javaapp;

import com.qualizeal.javaapp.assignment.Cat;
import com.qualizeal.javaapp.organization.HRManager;
import com.qualizeal.perimeter.Circle;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        Circle circle = new Circle();
        circle.getPerimeter();
        circle.getArea();
        HRManager hrmanager = new HRManager();
        hrmanager.work();
        hrmanager.addEmployee();
    }
}
