package com.example.employees;

public class Main {
    public static void main(String[] args) {
        HRManager hrManager = new HRManager(75000.0);
        hrManager.work(); 
        System.out.println("Salary: " + hrManager.getSalary());
        hrManager.addEmployee(); 
    }
}
