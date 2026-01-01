package com.inheritance.vehiclemanagementsystem;

//Main class to test the system
public class VehicleMain {
public static void main(String[] args) {
	
	//creating objects
   ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250, 75);
   PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);

   //displaying details
   System.out.println("Electric Vehicle Info:");
   ev.displayInfo();
   ev.charge();

   System.out.println("\nPetrol Vehicle Info:");
   pv.displayInfo();
   pv.refuel();
	}
}