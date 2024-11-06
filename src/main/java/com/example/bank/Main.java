package com.example.bank;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000.0, 0.05);
        CurrentAccount current = new CurrentAccount(500.0, 200.0);

        savings.deposit(200.0);
        savings.withdraw(150.0);
        savings.addInterest();

        current.deposit(300.0);
        current.withdraw(700.0);
        current.withdraw(100.0);
    }
}
