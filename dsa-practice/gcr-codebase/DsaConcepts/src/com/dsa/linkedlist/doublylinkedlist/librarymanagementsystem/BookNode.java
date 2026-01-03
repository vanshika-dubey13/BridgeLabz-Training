package com.dsa.linkedlist.doublylinkedlist.librarymanagementsystem;

//creating book node to store details of book
class BookNode {
	
	//attributes
    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;

    //pointers to next and prev book node
    BookNode next;
    BookNode prev;

    //constructor
    BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
