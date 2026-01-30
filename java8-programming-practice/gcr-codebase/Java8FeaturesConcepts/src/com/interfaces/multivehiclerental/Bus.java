package com.interfaces.multivehiclerental;

//implementing class
class Bus implements Vehicle {
	
    public void rent() {
        System.out.println("Bus rented");
    }

    public void returnVehicle() {
        System.out.println("Bus returned");
    }
    
}
