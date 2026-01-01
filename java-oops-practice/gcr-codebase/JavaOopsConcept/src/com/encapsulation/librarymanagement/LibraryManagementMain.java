package com.encapsulation.librarymanagement;

//main method
public class LibraryManagementMain {
    public static void main(String[] args) {
    	
    	//creating array to store items in library
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("B001", "Java Programming", "John Doe");
        items[1] = new Magazine("M001", "Time Magazine", "Various Authors");
        items[2] = new DVD("D001", "Inception", "Christopher Nolan");

        //displaying library items
        for (LibraryItem item : items) {
            item.getItemDetails(); 
            System.out.println();
        }

        // Reserving items
        Reservable reservableBook = (Reservable) items[0];
        reservableBook.reserveItem("Alice");
        Reservable reservableDVD = (Reservable) items[2];
        reservableDVD.reserveItem("Bob");
        System.out.println("Is the magazine available? " + ((Reservable) items[1]).checkAvailability());
    }
}
