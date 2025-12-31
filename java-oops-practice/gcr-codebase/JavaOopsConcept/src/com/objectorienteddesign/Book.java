package com.objectorienteddesign;

public class Book {
	
	//attributes
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
