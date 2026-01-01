package com.inheritance.librarymanagement;

	//subclass
	public class Author extends Book {
		String name;
		String bio;

		// Constructor
		Author(String title, int publicationYear, String name, String bio) {
			super(title, publicationYear); // Call Book constructor
			this.name = name;
			this.bio = bio;
		}

		// Method to display book and author details
		void displayInfo() {
			System.out.println("Book Title: " + title);
			System.out.println("Publication Year: " + publicationYear);
			System.out.println("Author Name: " + name);
			System.out.println("Author Bio: " + bio);
		}
}
