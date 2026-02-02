package com.interfaces.defaultmethods.smartvehicledashboard;

//VehicleDashboard.java
interface VehicleDashboard {
	void displaySpeed(int speed);

	// New feature using default method
	default void displayBatteryPercentage() {
		System.out.println("Battery information not available for this vehicle.");
	}
}
