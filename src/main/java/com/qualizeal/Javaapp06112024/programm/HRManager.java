package com.qualizeal.Javaapp06112024.programm;

public class HRManager extends Employee{
	public void work() {
		super.work();
		System.out.println("Work() from HRManager");
	}
	public void addEmployee() {
		System.out.println("addEmployee() from HRManager");
	}
}
