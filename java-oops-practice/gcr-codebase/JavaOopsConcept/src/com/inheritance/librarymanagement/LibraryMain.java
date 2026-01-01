package com.inheritance.librarymanagement;

//Main class
public class LibraryMain {
    public static void main(String[] args) {
    	
    	//creating object of author and assigning values
        Author author = new Author(
            "Java Programming",
            2023,
            "James Smith",
            "An experienced software developer and Java instructor."
        );

        author.displayInfo();
    }
}
