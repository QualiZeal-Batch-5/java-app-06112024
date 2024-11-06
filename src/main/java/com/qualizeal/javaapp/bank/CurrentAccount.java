package com.qualizeal.javaapp.bank;

public class CurrentAccount extends BankAccount{
	public void deposit(double value) {
		System.out.println("This is a child class method for current deposits");
	}
	
	public void withdraw(double value) {
		System.out.println("This is from child class method for current withdrawals.");
	}
}
