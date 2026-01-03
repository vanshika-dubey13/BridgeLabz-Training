package com.dsa.linkedlist.doublylinkedlist.moviemanagementsystem;

//creating movie node to store details
class MovieNode {
	
	//attributes
    String title;
    String director;
    int year;
    double rating;

    //setting pointers for prev and next node in linked list
    MovieNode next;
    MovieNode prev;

    //constructor
    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
