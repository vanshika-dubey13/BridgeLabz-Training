package com.constructorandinstancevariables;

public class BookLibraryMain {
    public static void main(String[] args) {

        EBook ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch");

        // Accessing public & protected members
        ebook.displayBookInfo();

        // Accessing private member via public methods
        System.out.println("Author: " + ebook.getAuthor());

        ebook.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}

