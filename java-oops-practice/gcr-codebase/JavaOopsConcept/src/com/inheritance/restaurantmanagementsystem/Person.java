package com.inheritance.restaurantmanagementsystem;

//superclass
class Person {
	
	//attributes
    protected String name;
    protected int id;

    //constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //displaying details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
