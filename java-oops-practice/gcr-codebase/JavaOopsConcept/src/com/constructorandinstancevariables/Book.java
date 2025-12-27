package com.constructorandinstancevariables;

public class Book {

	//Creating attributes of book class
	String title;
	String author;
	int price;
	
	//Creating default constructor
	Book(){
		title = "Java Programming";
		author = "Abc";
		price = 199;
	}
	
	//creating parametrized constructor
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//method to display book details
	private void displayBookDetails() {
		System.out.println("Book title : " + title);
		System.out.println("Book author : " + author);
		System.out.println("Book price : " + price);
		
	}
	
	public static void main(String[] args) {
		
		//default constructor
		Book book1 = new Book();
		System.out.println("Book 1 : ");
		book1.displayBookDetails();
	
	
		//Parametrized constructor
		Book book2 =new Book("Programming in C++", "XYZ",300);
		System.out.println("\nBook 2 : ");
		book2.displayBookDetails();

	

}
}
