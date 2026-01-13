package com.oopsscenariobased.GameBox;

//Inheritance: StrategyGame
public class StrategyGame extends Game {
	
	//constructor
	public StrategyGame(String title, double price, double rating) {
		super(title, "Strategy", price, rating);
	}

	//overriding method of parent class
	@Override
	public void playDemo() {
		System.out.println("Strategy demo: Plan your moves for the first mission.");
	}
}

