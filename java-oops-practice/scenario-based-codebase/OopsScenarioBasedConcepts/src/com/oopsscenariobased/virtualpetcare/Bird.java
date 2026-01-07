package com.oopsscenariobased.virtualpetcare;

// Subclass Bird
public class Bird extends Pet {
    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    //methods for birds
    public void feed() {
        changeHunger(-10);
        changeMood(10);
        System.out.println(name + " pecked some seeds.");
    }

    public void play() {
        changeEnergy(-15);
        changeMood(20);
        System.out.println(name + " is flying around!");
    }

    public void sleep() {
        changeEnergy(25);
        System.out.println(name + " is resting...");
    }

    public void makeSound() {
        System.out.println("Chirp! Chirp!");
    }
}


