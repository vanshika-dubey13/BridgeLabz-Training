package com.oopsscenariobased.travelitineraryplanner;

//International Trip
public class InternationalTrip extends Trip {
	
	//constructor
	InternationalTrip(String destination, int duration,
			Transport transport, Hotel hotel, Activity activity) {
			super(destination, duration, transport, hotel, activity);
	}

	//overriding method of parent class
	@Override
	public void book() {
		System.out.println("International Trip booked to " + destination + " with passport verification.");
	}
}