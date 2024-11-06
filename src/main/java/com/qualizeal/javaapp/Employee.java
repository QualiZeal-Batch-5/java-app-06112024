package com.qualizeal.javaapp;

public class Employee {
	
	double salary;

    public Employee(double salary) {
    	
        this.salary = salary;
        
    }

    public void work() {
    	
        System.out.println("Employee is working.");
        
    }
    
    public double getSalary() {
    	
        return salary;
        
    }
    
}
class HRManager extends Employee {
	
    public HRManager(double salary) {
    	
        super(salary);
        
    }
    
    public void work() {
    	
        System.out.println("HR Manager is managing the employee.");
        
    }
    
    public void addEmployee(String employeeName) {
    	
        System.out.println("Adding the name of the employee: " + employeeName);
        
    }
}


