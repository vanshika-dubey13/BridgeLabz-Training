package com.oopsscenariobased.eventmanagementplatform;

import java.util.Scanner;

abstract class Event implements ISchedulable {
	
	//attributes
	private final int eventId; 
	protected String eventName;
	protected String location;
	protected String date;
	protected int attendees;

	private double venueCost;
	private double serviceCost;
	private double discount;

	//constructor
	public Event(int eventId, String eventName, String location, String date, int attendees) {
		this.eventId = eventId;
		this.eventName = eventName;
		this.location = location;
		this.date = date;
		this.attendees = attendees;
	}

	// Constructor with services
	public Event(int eventId, String eventName, String location, String date,int attendees, double venueCost, double serviceCost, double discount) {
		this(eventId, eventName, location, date, attendees);
		this.venueCost = venueCost;
		this.serviceCost = serviceCost;
		this.discount = discount;
	}

	//pricing
	public double calculateTotalCost() {
		return venueCost + serviceCost - discount;
	}

	public int getEventId() {
		return eventId;
	}

	@Override
	public void reschedule(String newDate) {
		this.date = newDate;
		System.out.println(eventName + " rescheduled to " + newDate);
	}

	@Override
	public void cancel() {
		System.out.println(eventName + " has been cancelled.");
	}
}



