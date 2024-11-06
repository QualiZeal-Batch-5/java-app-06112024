package com.qualizeal.javaapp06112024.Employee;

import com.qualizeal.javaapp06112024.Employee.Employee;


public class App2 {
	public static void main(String[] args) {

		Employee emp1 = new Employee("Jyothi", 5000);
		emp1.work();
		System.out.println("Salary: " + emp1.getSalary());

		HRManager hrManager = new HRManager("Saritha", 7500);
		hrManager.work();
		System.out.println("Salary: " + hrManager.getSalary());

		hrManager.addEmployee(emp1);
	}
}
