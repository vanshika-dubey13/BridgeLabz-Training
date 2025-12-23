import java.util.Scanner;

public class DeckOfCards {

	// Method to initialize the deck
    	public static String[] initializingDeck(String[] suits, String[] ranks) {
        	int totalCards = suits.length * ranks.length;
        	String[] deck = new String[totalCards];
        	int index = 0;
        	for (String suit : suits) {
            		for (String rank : ranks) {
                		deck[index++] = rank + " of " + suit;
            		}
        	}
        	return deck;
    	}

	// Method to shuffle the deck
    	public static String[] shuffleDeck(String[] deck) {
        	int n = deck.length;
        	for (int i = 0; i < n; i++) {
            		int randomCardNumber = i + (int) (Math.random() * (n - i));
            		// Swaping cards
            		String temp = deck[i];
            		deck[i] = deck[randomCardNumber];
            		deck[randomCardNumber] = temp;
        	}
        	return deck;
    	}

	// Method to distribute cards to players
    	public static String[][] distributingCards(String[] deck, int n, int players) {
        	if (n % players != 0) {
            		return null;
        	}
        	int cardsPerPlayer = n / players;
        	String[][] playerCards = new String[players][cardsPerPlayer];
        	int cardIndex = 0;
        	for (int i = 0; i < players; i++) {
            		for (int j = 0; j < cardsPerPlayer; j++) {
                	playerCards[i][j] = deck[cardIndex++];
            		}
        	}
        	return playerCards;
    	}

	// Method to print players and their cards
    	public static void printPlayers(String[][] players) {
        	for (int i = 0; i < players.length; i++) {
            		System.out.println("Player " + (i + 1) + ":");
            		for (int j = 0; j < players[i].length; j++) {
                		System.out.println("  " + players[i][j]);
            		}
            		System.out.println();
        	}
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        	String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          	"Jack", "Queen", "King", "Ace"};

        	// Initializing and shuffling deck
        	String[] deck = initializingDeck(suits, ranks);
        	deck = shuffleDeck(deck);
        	System.out.print("Enter number of cards to distribute: ");
        	int n = sc.nextInt();
        	System.out.print("Enter number of players: ");
        	int players = sc.nextInt();
        	if (n > deck.length) {
            		System.out.println("Not enough cards in the deck!");
            		return;
        	}

        	String[] subDeck = new String[n];
        	System.arraycopy(deck, 0, subDeck, 0, n);

        	String[][] playerCards = distributingCards(subDeck, n, players);

        	if (playerCards == null) {
            		System.out.println("Cards cannot be evenly distributed among players.");
        	}
		else {
            		printPlayers(playerCards);
        	}

        	sc.close();
    	}
}
