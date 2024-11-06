package com.qualizeal.javaapp06112024.Employee;
import com.qualizeal.javaapp06112024.Employee.Employee;

public class HRManager extends Employee {

	public HRManager(String name, double salary) {
		super(name, salary);
	}

	public void work() {
		System.out.println(getName() + " is managing the HR department.");
	}

	public void addEmployee(Employee employee) {
		System.out.println(getName() + " is adding a new employee: " + employee.getName());
	}
}
