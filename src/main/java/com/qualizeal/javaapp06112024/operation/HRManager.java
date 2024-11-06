package com.qualizeal.javaapp06112024.operation;

public class HRManager extends Employee{
	public void addEmployee() {
		int empId = 1001;
		String empName = "abcd";
		
		System.out.println("employee ID : " + empId);
		System.out.println("employee Name : " + empName);
	}
	
	public void work() {
		addEmployee();
	}
}
