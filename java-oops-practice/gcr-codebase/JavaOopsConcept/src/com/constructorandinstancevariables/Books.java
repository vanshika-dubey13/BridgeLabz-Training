package com.constructorandinstancevariables;

public class Books {

	//Creating attributes of book class
	String title;
	String author;
	int price;
	boolean availability;
	
	//Creating default constructor
	Books(){
		title = "Java Programming";
		author = "Abc";
		price = 199;
		availability = true;
	}
	
	//creating parametrized constructor
	Books(String title, String author, int price, boolean availability){
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	
	//method to display book details
	private void displayBookDetails() {
		System.out.println("Book title : " + title);
		System.out.println("Book author : " + author);
		System.out.println("Book price : " + price);
		System.out.println("Book availability : " + availability);
		
	}
	
	public static void main(String[] args) {
		
		//default constructor
		Books book1 = new Books();
		System.out.println("Book 1 : ");
		book1.displayBookDetails();
	
	
		//Parametrized constructor
		Books book2 =new Books("Programming in C++", "XYZ",300,true);
		System.out.println("\nBook 2 : ");
		book2.displayBookDetails();

	

}
}
