package com.qualizeal.javaapp;
import com.qualizeal.javaapp06112024.operation.Animal;
import com.qualizeal.javaapp06112024.operation.Cat;

public class App {
    public static void main(String[] args) {
    	Animal myAnimal = new Animal();
        Cat myCat = new Cat();
        
        myAnimal.makeSound(); 
        myCat.makeSound();   
   }
}