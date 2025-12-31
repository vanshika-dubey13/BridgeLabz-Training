package com.objectorienteddesign;

public class LibraryMain {
	
	    public static void main(String[] args) {
	        // Create Book objects
	        Book book1 = new Book("1984", "George Orwell");
	        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
	        Book book3 = new Book("Moby Dick", "Herman Melville");

	        // Create Library objects
	        Library library1 = new Library("Central Library");
	        Library library2 = new Library("Community Library");

	        // Add books to libraries
	        library1.addBook(book1);
	        library1.addBook(book2);

	        library2.addBook(book3);

	        // Displaying books in each library
	        System.out.println("Books in " + library1.getLibraryName() + ":");
	        library1.displayBooks();

	        System.out.println("\nBooks in " + library2.getLibraryName() + ":");
	        library2.displayBooks();

	        // 
	        Library library3 = new Library("University Library");
	        library3.addBook(book1); // Book1 is added to a new library
	        library3.displayBooks(); // Book1 is still available even outside the previous libraries
	    }
	

}
