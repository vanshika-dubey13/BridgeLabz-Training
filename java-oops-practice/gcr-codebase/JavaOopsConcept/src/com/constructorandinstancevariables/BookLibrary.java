package com.constructorandinstancevariables;

public class BookLibrary {

    // creating attributes
    public String ISBN;

    protected String title;

    private String author;

    // Constructor
    public BookLibrary(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }
}
