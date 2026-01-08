package com.oopsscenariobased.eventmanagementplatform;

//Conference Event
public class ConferenceEvent extends Event {

	//constructor
	public ConferenceEvent(int eventId, String name, String location,
                       String date, int attendees, double venue, double services) {
		super(eventId, name, location, date, attendees, venue, services, 1000);
	}

	//overriding method of interface
	@Override
	public void schedule() {
		System.out.println(" Conference scheduled with setup and seating!");
		System.out.println("Total Cost: Rs. " + calculateTotalCost());
	}
}

