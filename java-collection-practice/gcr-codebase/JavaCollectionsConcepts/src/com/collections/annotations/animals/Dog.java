package com.collections.annotations.animals;

class Dog extends Animal {

	//overriding method of parent class
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
