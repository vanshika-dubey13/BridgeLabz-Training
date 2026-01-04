package com.dsa.linkedlist.circularlinkedlist.onlineticketreservation;

class TicketNode {
	
	//attributes
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    TicketNode next;

    //constructor
    TicketNode(int ticketId, String customerName, String movieName,
               int seatNumber, String bookingTime) {
    			this.ticketId = ticketId;
    			this.customerName = customerName;
    			this.movieName = movieName;
    			this.seatNumber = seatNumber;
    			this.bookingTime = bookingTime;
    			this.next = null;
    }
}
