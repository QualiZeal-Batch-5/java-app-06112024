package com.qualizeal.javaapp06112024.operation;

abstract class Animal {
    abstract void makeSound();

    class Cat extends Animal {
        public void makeSound() {
            System.out.println("Meow");
        }
    }
}