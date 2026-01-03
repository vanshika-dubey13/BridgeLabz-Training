package com.dsa.linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieMain {
    public static void main(String[] args) {

        MovieOperations movies = new MovieOperations();

        //performing operations on movie
        movies.addAtEnd("Inception", "Nolan", 2010, 8.8);
        movies.addAtBeginning("Interstellar", "Nolan", 2014, 8.6);
        movies.addAtEnd("Avatar", "Cameron", 2009, 7.8);
        movies.addAtPosition(2, "Titanic", "Cameron", 1997, 7.9);

        System.out.println("Movies (Forward):");
        movies.displayForward();

        System.out.println("\nMovies (Reverse):");
        movies.displayReverse();

        System.out.println("\nSearch by Director: Nolan");
        movies.searchByDirector("Nolan");

        System.out.println("\nUpdate Rating of Avatar:");
        movies.updateRating("Avatar", 8.1);
        movies.displayForward();

        System.out.println("\nRemove Movie: Titanic");
        movies.removeByTitle("Titanic");
        movies.displayForward();
    }
}
