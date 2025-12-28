package com.constructorandinstancevariables;

public class EBook extends BookLibrary {

    // Constructor
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to demonstrate access
    public void displayBookInfo() {
        System.out.println("ISBN: " + ISBN);      // public access
        System.out.println("Title: " + title);    // protected access
    }
}
