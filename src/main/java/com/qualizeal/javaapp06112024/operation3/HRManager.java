package com.qualizeal.javaapp06112024.operation3;

public class HRManager extends Employee {

	public HRManager(double salary) {
		super(salary);

	}
	
	public void work() {
		System.out.println("HR Manager is working.");
	}

	public void addEmployee(String employeeName) {
		System.out.println("Adding employee: " + employeeName);
	}

}
