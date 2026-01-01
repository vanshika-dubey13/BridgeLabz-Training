package com.inheritance.restaurantmanagementsystem;

//subclass
public class Chef extends Person implements Worker {

	//constructor
    public Chef(String name, int id) {
        super(name, id);
    }

    //overriding method of parent class
    @Override
    public void performDuties() {
        System.out.println("Chef is preparing and cooking food.");
    }
}
