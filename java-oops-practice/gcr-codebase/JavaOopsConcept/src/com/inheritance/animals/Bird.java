package com.inheritance.animals;


//Subclass Dog
class Bird extends Animal {
	public Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Chirp! Chirp!");
	}
}

