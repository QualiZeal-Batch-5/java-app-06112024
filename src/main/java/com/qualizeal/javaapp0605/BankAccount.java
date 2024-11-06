package com.qualizeal.javaapp0605;

public abstract class BankAccount {
	public int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public abstract void deposit(int amount);
	public abstract void withdraw(int amount);
	
	public void balance() {
		System.out.println("Balance: "+balance);
	}
}