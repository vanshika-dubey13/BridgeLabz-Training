package com.inheritance.animals;

//Main class to test polymorphism
public class AnimalMain {
	public static void main(String[] args) {
   // Creating objects of different animals
   Animal myDog = new Dog("Buddy", 3);
   Animal myCat = new Cat("Whiskers", 2);
   Animal myBird = new Bird("Tweety", 1);

   // Array of animals
   Animal[] animals = {myDog, myCat, myBird};

   // Demonstrating polymorphism
   for (Animal animal : animals) {
       animal.displayInfo();
       animal.makeSound();
       System.out.println();
   }
}}