package com.qualizeal.javaapp06112024.operation;

abstract class Employee {
    abstract void work();
    abstract double getSalary();
}

class HRManager extends Employee {
  
    public void work() {
        System.out.println("Managing HR tasks");
    }

    
    public double getSalary() {
        return 50000;
    }

    public void addEmployee() {
        System.out.println("Adding a new employee");
    }
}