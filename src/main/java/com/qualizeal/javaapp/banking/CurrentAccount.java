package com.qualizeal.javaapp.banking;

public abstract class CurrentAccount extends BankAccount {
	public void deposit() {
		System.out.println("CurrentAccountDeposit()");
	}
	public void withdraw() {
		System.out.println("CurrentAccountWithdraw()");
	}
}
