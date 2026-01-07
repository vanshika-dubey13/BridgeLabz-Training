package com.oopsscenariobased.virtualpetcare;

//Subclass Cat 
class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    //displaying methods for cat
    public void feed() {
    	//displaying a random number for hunger and mood level of bird
        changeHunger(-15);
        changeMood(5);
        System.out.println(name + " ate quietly.");
    }

    public void play() {
    	//randomly displaying a hunger and mood level of bird
        changeEnergy(-10);
        changeMood(15);
        System.out.println(name + " chased a laser!");
    }

    public void sleep() {
        changeEnergy(40);
        System.out.println(name + " is napping...");
    }

    public void makeSound() {
        System.out.println("Meow!");
    }
}