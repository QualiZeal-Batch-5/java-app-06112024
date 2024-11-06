package com.qualizeal.javaapp.company;

public class HRManager extends Employee{
@Override
	public void work() {
		// TODO Auto-generated method stub
		//super.work();
		System.out.println("work() from HRManager.");
	}

	public void addEmployee() {
		System.out.println("addEmployee() from HRManager.");
	}
}
