/*Create a Java Application to create an abstract class BankAccount with abstract methods deposit() and withdraw(). 
Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class
implement the respective methods to handle deposits and withdrawals for each account type.*/

package com.qualizeal.javaapp06112024.operation;

public abstract class BankAccount {
	abstract public void deposit();
	abstract public void withdraw();
}
