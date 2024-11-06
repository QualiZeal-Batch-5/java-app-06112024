package com.qualizeal.javaapp06112024.operation;

public class HRManager extends Employee {
	
	@Override
	public void work() {
		System.out.println("Employee work overriden");
	}
	
	public void addEmployee() {
		System.out.println("Add new Employee");
	}
	
}
