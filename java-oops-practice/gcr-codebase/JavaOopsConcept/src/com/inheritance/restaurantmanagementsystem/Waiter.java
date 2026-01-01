package com.inheritance.restaurantmanagementsystem;

//subclass
public class Waiter extends Person implements Worker {

	//constructor
    public Waiter(String name, int id) {
        super(name, id);
    }

    //overriding method of parent class
    @Override
    public void performDuties() {
        System.out.println("Waiter is serving food and assisting customers.");
    }
}
