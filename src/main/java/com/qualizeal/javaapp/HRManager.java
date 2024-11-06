package com.qualizeal.javaapp;

public class HRManager extends Employee{
	
	public HRManager(String name, double salary) {
        super(name, salary);
    }
	
	public void work() {
        System.out.println(getName());
    }
	
	public void addEmployee(String employeeName) {
        System.out.println(getName() + " is adding a new employee : " + employeeName);
    }
}    
  	
        


