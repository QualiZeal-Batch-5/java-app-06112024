package com.qualizeal.javaapp06112024.animal;

public class HRManager extends Employee {
	public HRManager(String name, double salary) {
        super(name, salary);
	}
	
    public void work() {
    	System.out.println(getName() + " is managing java sessions");
    }
    
    public void addEmployee(String employeeName) {
        System.out.println(getName() + " we added another employee named: " + employeeName);
    }

}
