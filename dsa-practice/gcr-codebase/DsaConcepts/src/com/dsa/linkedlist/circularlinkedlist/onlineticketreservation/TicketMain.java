package com.dsa.linkedlist.circularlinkedlist.onlineticketreservation;

import java.util.Scanner;

public class TicketMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketOperations ops = new TicketOperations();
        int choice;

        //displaying menu
        do {
            System.out.println("\n--- Online Ticket Reservation ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Tickets");
            System.out.println("4. Search Ticket");
            System.out.println("5. Total Tickets");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Customer Name: ");
                    String cust = sc.nextLine();
                    System.out.print("Movie Name: ");
                    String movie = sc.nextLine();
                    System.out.print("Seat Number: ");
                    int seat = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Booking Time: ");
                    String time = sc.nextLine();
                    ops.addTicket(id, cust, movie, seat, time);
                    break;

                case 2:
                    System.out.print("Enter Ticket ID to cancel: ");
                    ops.removeTicket(sc.nextInt());
                    break;

                case 3:
                    ops.displayTickets();
                    break;

                case 4:
                    System.out.print("Enter Customer or Movie Name: ");
                    ops.searchTicket(sc.nextLine());
                    break;

                case 5:
                    ops.totalTickets();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);

        sc.close();
    }
}
