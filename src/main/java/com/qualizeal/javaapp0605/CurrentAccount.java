package com.qualizeal.javaapp0605;

public class CurrentAccount extends BankAccount {
	public CurrentAccount(int balance) {
		super(balance);
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
		} 
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public void balance() {
		super.balance();
	}
}
