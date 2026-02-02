package com.interfaces.defaultmethods.smartvehicledashboard;

public class SmartVehcileDashboardMain {
	public static void main(String[] args) {
		//object for petrol class
		VehicleDashboard petrolCar = new PetrolCar();
		petrolCar.displaySpeed(80);
		petrolCar.displayBatteryPercentage();

		//object for electric class
		VehicleDashboard electricCar = new ElectricCar();
		electricCar.displaySpeed(100);
		electricCar.displayBatteryPercentage();
	}
}
