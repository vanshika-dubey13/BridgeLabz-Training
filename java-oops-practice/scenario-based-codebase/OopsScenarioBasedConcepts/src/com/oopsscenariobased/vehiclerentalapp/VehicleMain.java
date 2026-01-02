package com.oopsscenariobased.vehiclerentalapp;

public class VehicleMain {
    public static void main(String[] args) {
    	
    	
    	//creating object of customer
        Customer customer = new Customer("C101", "Rahul");

        //creating objects of different vehicles
        Vehicle bike = new Bike("B01", "Hero");
        Vehicle car = new Car("C01", "Honda");
        Vehicle truck = new Truck("T01", "Tata");

        int days = 3;

        //displaying results
        System.out.println("Customer: " + customer.getName());
        System.out.println("Bike Rent: Rs. " + bike.calculateRent(days));
        System.out.println("Car Rent: Rs. " + car.calculateRent(days));
        System.out.println("Truck Rent: Rs. " + truck.calculateRent(days));
    }
}
