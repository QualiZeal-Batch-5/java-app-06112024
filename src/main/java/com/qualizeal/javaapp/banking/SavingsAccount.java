package com.qualizeal.javaapp.banking;

public abstract class SavingsAccount extends CurrentAccount {
	public void deposit() {
		System.out.println("SavingsAccountDeposit()");
	}
	public void withdraw() {
		System.out.println("SavingsAccountWithdraw()");
	}
}
