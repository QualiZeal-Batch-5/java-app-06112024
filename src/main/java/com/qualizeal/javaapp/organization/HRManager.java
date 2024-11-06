package com.qualizeal.javaapp.organization;

public class HRManager extends Employee {
	public void work() {
		System.out.println("This method is from child class which is overrided.");
	}
	
	public void addEmployee() {
		System.out.println("This is child's own method.");
	}
}
