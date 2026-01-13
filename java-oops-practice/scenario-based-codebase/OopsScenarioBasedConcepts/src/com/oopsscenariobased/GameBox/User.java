package com.oopsscenariobased.GameBox;

import java.util.*;

//User class
public class User {

	//attributes
	private String username;
	protected List<Game> ownedGames = new ArrayList<>();

	//constructor
	public User(String username) {
		this.username = username;
	}

	public void buyGame(Game game) {
		ownedGames.add(game);
		System.out.println(username + " purchased: " + game.getTitle());
	}

	public void showOwnedGames() {
		System.out.println("Owned games by " + username + ":");
		for (Game g : ownedGames) {
			System.out.println("- " + g);
		}
	}
}

