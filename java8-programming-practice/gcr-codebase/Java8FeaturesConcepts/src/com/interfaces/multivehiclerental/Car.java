package com.interfaces.multivehiclerental;

//implementing class
class Car implements Vehicle {
    public void rent() {
    	
        System.out.println("Car rented");
    }

    public void returnVehicle() {
        System.out.println("Car returned");
    }
    
}
