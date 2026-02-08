package com.designprinciples.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    private static LibraryCatalog instance;

    private List<Book> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    private LibraryCatalog() { }

    // Singleton
    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    // Observer methods
    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // Business logic
    public void addBook(Book book) {
        books.add(book);
        notifyUsers(book.getTitle());
    }

    private void notifyUsers(String title) {
        for (Observer o : observers) {
            o.update("New book available: " + title);
        }
    }
}
