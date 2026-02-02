package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

//class Book to store book details
class Book {
	//attributes
    String title;
    String genre;
    int pages;

    //constructor
    Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    //method to get book genre
    public String getGenre() {
        return genre;
    }

    //method to get pages in books
    public int getPages() {
        return pages;
    }
}

//main class
public class LibrarayBookStatistics {
    public static void main(String[] args) {

        List<Book> books = List.of(
            new Book("Book A", "Fiction", 300),
            new Book("Book B", "Fiction", 450),
            new Book("Book C", "Science", 200),
            new Book("Book D", "Science", 350),
            new Book("Book E", "History", 500)
        );

        Map<String, IntSummaryStatistics> statsByGenre =
            books.stream()
                 .collect(Collectors.groupingBy(
                     Book::getGenre,
                     Collectors.summarizingInt(Book::getPages)
                 ));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println(genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Max Pages: " + stats.getMax());
            System.out.println();
        });
    }
}
