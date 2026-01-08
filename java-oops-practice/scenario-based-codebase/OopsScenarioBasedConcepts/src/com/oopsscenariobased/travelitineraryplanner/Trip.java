package com.oopsscenariobased.travelitineraryplanner;

//Base Trip Class
public class Trip implements IBookable {
	
	//attributes
	protected String destination;
	protected int duration;
	protected Transport transport;
	protected Hotel hotel;
	protected Activity activity;

	//constructor
	Trip(String destination, int duration,
			Transport transport, Hotel hotel, Activity activity) {
			this.destination = destination;
			this.duration = duration;
			this.transport = transport;
			this.hotel = hotel;
			this.activity = activity;
	}

	//caluculating budget
	double totalBudget() {
		return transport.getCost() + hotel.getCost() + activity.getCost();
	}

	//overriding method of interface
	@Override
	public void book() {
		System.out.println("Trip booked successfully.");
	}

	@Override
	public void cancel() {
		System.out.println("Trip cancelled.");
	}
}

