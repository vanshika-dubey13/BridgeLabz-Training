package com.objectorienteddesign;

import java.util.ArrayList;

public class Library {
	
	//attributes
    private String libraryName;
    private ArrayList<Book> books;

    // Constructor to initialize the library name and books list
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Library: " + libraryName);
        for (Book book : books) {
            book.displayBookInfo();
        }
    }

	public String getLibraryName() {
		return libraryName;
	}
}

