package com.oopsscenariobased.GameBox;

//Base Game class
public class Game implements IDownloadable {
	
	//attributes
	private String title;
	private String genre;
	protected double price;   
	private double rating;

	// Constructor for paid games
	public Game(String title, String genre, double price, double rating) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.rating = rating;
	}

	// Constructor for free games
	public Game(String title, String genre) {
		this(title, genre, 0.0, 0.0);
	}

	// method to apply seasonal offers
	public void applySeasonalOffer(double discountPercent) {
		price = price - (price * discountPercent / 100); // arithmetic operators
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	//overriding method of parent class
	@Override
	public void download() {
		System.out.println(title + " downloaded successfully.");
	}

	@Override
	public void playDemo() {
		System.out.println("Playing demo of " + title);
	}

	@Override
	public String toString() {
		return title + " | Genre: " + genre + " | Price: $" + price + " | Rating: " + rating;
	}
}

