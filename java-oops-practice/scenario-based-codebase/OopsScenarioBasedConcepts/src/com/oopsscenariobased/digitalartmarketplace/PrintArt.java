package com.oopsscenariobased.digitalartmarketplace;

//subclass
public class PrintArt extends Artwork {
	
	//constructor
	PrintArt(String title, String artist, double price) {
        super(title, artist, price, "Print License");
    }

	//method to display license type
	@Override
    public void license() {
        System.out.println("Print Art License: Limited prints allowed");
    }
}

