package com.interfaces.defaultmethods.smartvehicledashboard;

//implementing class
class ElectricCar implements VehicleDashboard {
	 public void displaySpeed(int speed) {
	     System.out.println("Electric Car Speed: " + speed + " km/h");
	 }

	 //overriding method of interface
	 @Override
	 public void displayBatteryPercentage() {
	     System.out.println("Battery Level: 85%");
	 }
}
