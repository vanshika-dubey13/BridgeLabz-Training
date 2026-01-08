package com.oopsscenariobased.travelitineraryplanner;

//Domestic Trip
public class DomesticTrip extends Trip {
	
	//constructor
	DomesticTrip(String destination, int duration,
            Transport transport, Hotel hotel, Activity activity) {
			super(destination, duration, transport, hotel, activity);
	}

	//overriding method of parent class
	@Override
	public void book() {
		System.out.println("Domestic Trip booked to " + destination);
	}
}