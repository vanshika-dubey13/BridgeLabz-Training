package com.oopsscenariobased.eventmanagementplatform;

import java.util.Scanner;

public class EventMain {
	 public static void main(String[] args) {

	     Scanner sc = new Scanner(System.in);
	     System.out.println("Welcome to EventEase");
	     System.out.println("1. Birthday Event");
	     System.out.println("2. Conference Event");
	     System.out.print("Choose Event Type: ");

	     int choice = sc.nextInt();
	     Event event = null;

	     switch (choice) {
	         case 1:
	             event = new BirthdayEvent(
	                     101,
	                     "John's Birthday",
	                     "Banquet Hall",
	                     "10-10-2026",
	                     50,
	                     20000,
	                     8000
	             );
	             break;

	         case 2:
	             event = new ConferenceEvent(
	                     102,
	                     "Tech Conference",
	                     "Convention Center",
	                     "15-11-2026",
	                     200,
	                     50000,
	                     20000
	             );
	             break;

	         default:
	             System.out.println("Invalid choice");
	             System.exit(0);
	     }

	     event.schedule();
	     event.reschedule("20-12-2026");
	     event.cancel();

	     sc.close();
	 	}
}
