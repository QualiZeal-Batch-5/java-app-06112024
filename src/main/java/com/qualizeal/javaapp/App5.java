package com.qualizeal.javaapp;

import com.qualizeal.javaapp06112024.operation.CurrentAccount;
import com.qualizeal.javaapp06112024.operation.SavingsAccount;

public class App5 {
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount();
		CurrentAccount currentAccount = new CurrentAccount();
		
		savingsAccount.deposit();
		savingsAccount.withdraw();
		
		System.out.println();
		
		currentAccount.deposit();
		currentAccount.withdraw();
	}
}
