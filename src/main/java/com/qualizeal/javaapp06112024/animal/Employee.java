package com.qualizeal.javaapp06112024.animal;

public class Employee {
	
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
	
	public void work() {
        System.out.println(name + " is doing her job.");
    }
	
	public double getSalary() {
        return salary;
    }
	
	public String getName() {
		return name;
	}
}
