package com.qualizeal.javaapp06112024.operation;
class SavingsAccount extends BankAccount {
    
    public void deposit(double amount) {
        System.out.println("Handling Deposits: " + amount);
    }

   
    public void withdraw(double amount) {
    	System.out.println("withdraw:" + amount);
    	
    }
}