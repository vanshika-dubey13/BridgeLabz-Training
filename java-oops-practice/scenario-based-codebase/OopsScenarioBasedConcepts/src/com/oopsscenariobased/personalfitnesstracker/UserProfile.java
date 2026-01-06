package com.oopsscenariobased.personalfitnesstracker;

class UserProfile {
	
	//attributes
    private String name;
    private int age;
    private double weight; 
    private int dailyCalorieGoal;

    //constructor
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, 2000);
    }

    // constructor
    public UserProfile(String name, int age, double weight, int goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = goal;
    }

    public int getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }

    public double getWeight() {
        return weight;
    }

    //displaying details 
    public void displayProfile() {
        System.out.println("\n--- User Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Daily Calorie Goal: " + dailyCalorieGoal);
    }
}
