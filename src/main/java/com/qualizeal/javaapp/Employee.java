package com.qualizeal.javaapp;

public abstract class Employee {
	
	private String name;
	private double salary;

	
	public Employee(String name , double salary) {
	    this.name = name;
	    this.salary = salary;
	}

	
	public abstract void work();

	
	public double getSalary() {
	    return salary;
	}

	
	public String getName() {
	    return name;
	}
}


