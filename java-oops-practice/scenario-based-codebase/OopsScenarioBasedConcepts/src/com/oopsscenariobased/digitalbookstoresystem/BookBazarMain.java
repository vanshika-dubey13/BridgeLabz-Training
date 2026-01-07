package com.oopsscenariobased.digitalbookstoresystem;

import java.util.Scanner;

//Main class
public class BookBazarMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//creating different objects of books
		Book ebook = new EBook("Java Basics", "James Gosling", 500, 10);
		Book pbook = new PrintedBook("OOP Concepts", "Bjarne Stroustrup", 800, 5);

		//displaying menu
		while (true) {
			System.out.println("\n--- BookBazaar Menu ---");
			System.out.println("1. Buy EBook");
			System.out.println("2. Buy Printed Book");
			System.out.println("3. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();

			switch (choice) {
				case 1 -> processOrder(sc, ebook);
				case 2 -> processOrder(sc, pbook);
				case 3 -> {
					System.out.println("Thank you for using BookBazaar!");
					System.exit(0);
				}
				default -> System.out.println("Invalid choice!");
			}
		}
	}
	private static void processOrder(Scanner sc, Book book) {
		System.out.print("Enter your name: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.print("Enter quantity: ");
		int qty = sc.nextInt();

		if (book.reduceStock(qty)) {
			Order order = new Order(name, book, qty);
			order.updateStatus("CONFIRMED");
			order.showOrder();
		}
		else {
			System.out.println("Insufficient stock available!");
		}
	}
}
