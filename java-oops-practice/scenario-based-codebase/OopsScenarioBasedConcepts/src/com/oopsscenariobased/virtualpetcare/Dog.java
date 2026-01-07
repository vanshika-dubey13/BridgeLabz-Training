package com.oopsscenariobased.virtualpetcare;

//Dog Class
public class Dog extends Pet {
	public Dog(String name, int age) {
		super(name, "Dog", age);
	}

	public void feed() {
		changeHunger(-20);
		changeMood(10);
		System.out.println(name + " enjoyed the food!");
	}

	public void play() {
		changeEnergy(-20);
		changeMood(20);
		System.out.println(name + " played fetch!");
	}

	public void sleep() {
		changeEnergy(30);
		System.out.println(name + " is sleeping...");
	}

	public void makeSound() {
		System.out.println("Woof! Woof!");
	}
}