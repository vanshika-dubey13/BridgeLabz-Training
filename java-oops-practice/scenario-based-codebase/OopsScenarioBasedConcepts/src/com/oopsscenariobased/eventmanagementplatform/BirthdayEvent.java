package com.oopsscenariobased.eventmanagementplatform;

//Birthday Event subclass
public class BirthdayEvent extends Event {

	//constructor
	public BirthdayEvent(int eventId, String name, String location,
			String date, int attendees, double venue, double services) {
		super(eventId, name, location, date, attendees, venue, services, 500);
	}

	///overriding method of interface
	@Override
	public void schedule() {
		System.out.println("Birthday Event scheduled with cake and decorations!");
		System.out.println("Total Cost: Rs. " + calculateTotalCost());
	}
}