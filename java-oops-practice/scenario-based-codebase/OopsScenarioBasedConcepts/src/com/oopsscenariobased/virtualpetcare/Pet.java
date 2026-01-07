package com.oopsscenariobased.virtualpetcare;

import java.util.Random;

abstract class Pet implements IInteractable {
	
	//attributes
    protected String name;
    protected String type;
    protected int age;

    private int hunger;
    private int mood;
    private int energy;

    //generating a random number
    Random r = new Random();

    // Constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = r.nextInt(50) + 30;
        this.mood = r.nextInt(50) + 30;
        this.energy = r.nextInt(50) + 30;
    }

    protected void changeHunger(int value) {
        hunger = Math.max(0, Math.min(100, hunger + value));
    }

    protected void changeMood(int value) {
        mood = Math.max(0, Math.min(100, mood + value));
    }

    protected void changeEnergy(int value) {
        energy = Math.max(0, Math.min(100, energy + value));
    }

    //method to display pet's status
    public void showStatus() {
        System.out.println("\n--- Pet Status ---");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Hunger: " + hunger);
        System.out.println("Mood: " + mood);
        System.out.println("Energy: " + energy);
    }

    public abstract void makeSound();
}
