package com.dsa.linkedlist.circularlinkedlist.onlineticketreservation;

class TicketOperations {
	
	//attributes
    private TicketNode head = null;
    private int count = 0;

    // Adding ticket at end
    public void addTicket(int id, String cust, String movie,
                          int seat, String time) {
        TicketNode newNode = new TicketNode(id, cust, movie, seat, time);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            TicketNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        count++;
        System.out.println("Ticket booked successfully!");
    }

    // Removing ticket by ID
    public void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets to remove");
            return;
        }

        TicketNode curr = head;
        TicketNode prev = null;

        do {
            if (curr.ticketId == id) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else if (curr == head) {
                    TicketNode temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = curr.next;
                    temp.next = head;
                } else {
                    prev.next = curr.next;
                }
                count--;
                System.out.println("Ticket removed successfully!");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket ID not found");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        System.out.println("\n--- Booked Tickets ---");
        do {
            System.out.println("Ticket ID: " + temp.ticketId);
            System.out.println("Customer: " + temp.customerName);
            System.out.println("Movie: " + temp.movieName);
            System.out.println("Seat: " + temp.seatNumber);
            System.out.println("Time: " + temp.bookingTime);
            System.out.println("---------------------");
            temp = temp.next;
        } while (temp != head);
    }

    // Searching ticket by Customer Name or Movie Name
    public void searchTicket(String key) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(key) ||
                temp.movieName.equalsIgnoreCase(key)) {
                System.out.println("Ticket Found:");
                System.out.println("Ticket ID: " + temp.ticketId);
                System.out.println("Customer: " + temp.customerName);
                System.out.println("Movie: " + temp.movieName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No matching ticket found");
    }

    // Displaying total tickets
    public void totalTickets() {
        System.out.println("Total Booked Tickets: " + count);
    }
}
