package com.dsa.linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryMain {
    public static void main(String[] args) {

        LibraryOperations library = new LibraryOperations();

        //performing operations on library
        library.addAtEnd(101, "Java Programming", "James Gosling", "Programming", true);
        library.addAtBeginning(102, "Data Structures", "Mark Allen", "CS", true);
        library.addAtEnd(103, "Operating Systems", "Andrew Tanenbaum", "CS", false);
        library.addAtPosition(2, 104, "Computer Networks", "Tanenbaum", "Networking", true);

        System.out.println("\nDisplaying all books in library :");
        library.displayForward();

        System.out.println("\nDisplaying all books in library (Alphabetically Reverse Order)");
        library.displayReverse();

        System.out.println("\nSearch books by Title:");
        library.searchByTitle("Data Structures");

        System.out.println("\nSearch book by Author:");
        library.searchByAuthor("Tanenbaum");

        System.out.println("\nUpdate Availability:");
        library.updateAvailability(103, true);
        library.displayForward();

        System.out.println("\nRemove Book ID 102:");
        library.removeById(102);
        library.displayForward();

        System.out.println();
        library.countBooks();
    }
}
