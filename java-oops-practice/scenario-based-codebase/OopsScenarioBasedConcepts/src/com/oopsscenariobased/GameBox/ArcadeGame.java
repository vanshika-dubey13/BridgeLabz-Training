package com.oopsscenariobased.GameBox;

//subclass
public class ArcadeGame extends Game {
	
	//constructor
	public ArcadeGame(String title, double price, double rating) {
		super(title, "Arcade", price, rating);
	}

	//overriding method of parent clas
	@Override
	public void playDemo() {
		System.out.println("Arcade demo: Fast-paced action for 60 seconds!");
	}
}

