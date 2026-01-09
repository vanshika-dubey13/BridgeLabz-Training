package com.oopsscenariobased.digitalartmarketplace;

// Base Class 
public class Artwork implements IPurchasable {
	
	//attributes
	String title;
    String artist;
    double price;
    protected String licenseType;

    // Constructor without preview
    Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    // Constructor with preview
    Artwork(String title, String artist, double price, String licenseType, boolean preview) {
        this(title, artist, price, licenseType);
        if (preview)
        	//displaying preview
            System.out.println("Preview available for: " + title);
    }

    //method to purchase artwork
    public void purchase(User user) {
        if (user.walletBalance >= price) {
            user.walletBalance -= price;
            System.out.println("Purchased: " + title);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    //method to display license type
    public void license() {
        System.out.println("Standard License: " + licenseType);
    }
}
