package com.oopsscenariobased.digitalartmarketplace;

//subclass
public class DigitalArt extends Artwork {
	
	//constructor
	DigitalArt(String title, String artist, double price) {
        super(title, artist, price, "Digital License", true);
    }

	//method to display license type
	@Override
    public void license() {
        System.out.println("Digital Art License: Personal use only");
    }
}