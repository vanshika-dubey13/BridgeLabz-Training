package com.interfaces.multivehiclerental;

public class MultiVehicleRentalMain {
    public static void main(String[] args) {

    	//creating objects for different vehicle types
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}

