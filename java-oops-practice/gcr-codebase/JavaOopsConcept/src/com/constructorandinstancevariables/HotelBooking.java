package com.constructorandinstancevariables;

/**
 * 
 */
public class HotelBooking {
	
	//creating attributes for hotel
	String guestName;
	String roomType;
	int nights;
	
	//default constructor
	HotelBooking(){
		guestName = "David";
		roomType ="Single room";
		nights =2;
	}
	
	//parametrized constructor
	HotelBooking(String guestName, String roomType,int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	//copy constructor
	HotelBooking(HotelBooking prev){
		this.guestName = prev.guestName;
		this.roomType = prev.roomType;
		this.nights = prev.nights;
	}
	
	
	//display hotel booking details
	public void displayBookingDetails() {
		System.out.println("Guest name : "+guestName);
		System.out.println("Room Type Booked : "+roomType );
		System.out.println("Book for : "+ nights +" nights");
	}
	
	public static void main(String[] args) {
		
		//default constructor
		HotelBooking hb1 =  new HotelBooking();
		System.out.println("Hotel booking details : 1");
		hb1.displayBookingDetails();
		
		//parametrized constructor
		HotelBooking hb2=  new HotelBooking("Alice", "Two rooms", 4);
		System.out.println("\nHotel booking details : 2");
		hb2.displayBookingDetails();
		
		//copy constructor
		HotelBooking hb3 =new HotelBooking(hb1);
		System.out.println("\nHotel booking details : 3(created using copying 2)");
	     hb3.displayBookingDetails();
		
	}
}
