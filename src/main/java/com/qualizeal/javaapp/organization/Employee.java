package com.qualizeal.javaapp.organization;

public class Employee {
	private double salary;
	
	public void work() {
		System.out.println("This method is from parent class.");
	}
	
	public void setSalary (double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
}
