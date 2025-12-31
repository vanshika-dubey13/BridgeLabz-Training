package com.inheritance.animals;

//Subclass Dog
class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Meow! Meow!");
	}
}
