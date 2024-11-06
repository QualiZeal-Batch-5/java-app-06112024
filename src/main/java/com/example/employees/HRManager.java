package com.example.employees;

public class HRManager extends Employee {
    private double salary;

    public HRManager(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Managing HR tasks");
    }

    
    public double getSalary() {
        return salary;
    }

    public void addEmployee() {
        System.out.println("Adding a new employee");
    }
}