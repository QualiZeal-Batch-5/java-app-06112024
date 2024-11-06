package com.qualizeal.javaapp;

import com.qualizeal.javaapp06112024.Operation.*;


public class App {
    public static void main(String[] args) {
    	
    	Cat cat=new Cat();
    	cat.makeSound();
    	
    	Circle circle=new Circle();
    	double result=circle.getPerimeter(8);
    	double result1=circle.getArea(9);
    	System.out.println(result);
    	System.out.println(result1);
    	
    	HrManager hrmanager=new HrManager();
    	hrmanager.addEmployee("hei");
    	hrmanager.work();
    	
    	Truck truck =new Truck();
    	
    	
    	SavingsAccount savingsaccount=new SavingsAccount();
    	CurrentAccount currentaccount=new CurrentAccount();
    	savingsaccount.deposit();
    	savingsaccount.withdraw();
    	currentaccount.deposit();
    	currentaccount.withdraw();
    	
    	
    	
       
    }
}
