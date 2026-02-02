package com.interfaces.defaultmethods.smartvehicledashboard;

//implementing subclass
class PetrolCar implements VehicleDashboard {
	//overriding method
	@Override 
	public void displaySpeed(int speed) {
	     System.out.println("Petrol Car Speed: " + speed + " km/h");
	 }
}