package com.inheritance.restaurantmanagementsystem;

//main class
public class ResturantMain {
    public static void main(String[] args) {

    	//creating objects
        Chef chef = new Chef("Gordon", 101);
        Waiter waiter = new Waiter("John", 201);

        //displaying details
        chef.displayInfo();
        chef.performDuties();
        System.out.println();
        waiter.displayInfo();
        waiter.performDuties();
    }
}
