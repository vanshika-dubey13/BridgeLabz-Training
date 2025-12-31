package com.inheritance.animals;

//Superclass
class Animal {
	
	//attributes
	String name;
	int age;

	// Constructor
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method to be overridden
	public void makeSound() {
		System.out.println("In class animal");
	}

	// Optional: display animal info
	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}





