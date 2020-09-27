import java.util.List;
import java.util.ArrayList;

public class Player {
	//fields
	private List<Card> hand;
	private int score;
	private StringBuilder name;
	
	//public methods
	
	//Constructor
	// Takes one argument, player name. 
	public Player(String playerName) {
		this.hand = new ArrayList<Card>();
		this.score = 0;
		this.name = new StringBuilder(playerName);
	}
	
	//This method takes a card from the deck and adds it to this players hand
	public void draw(Deck deck) {
		this.hand.add(deck.draw());
	}
	
	
	//This method returns the first card in this player's hand. Returns null if hand is empty
	public Card flip() {
		if (!hand.isEmpty()) {
			return hand.remove(0);
		} else {
			return null;
		}
		
	}
	
	//this method prints out player info, and calls describe method on each card in the Card list (hand)
	public void describe() {
		System.out.println("Player name: " + this.name.toString() + " || Score: " + this.score + "\nHand:");
		for (Card currentCard : hand) {
			currentCard.describe();
		}
	}
	
	//this method returns player score
	public int getScore() {
		return this.score;
	}
	
	//this method returns the player's name as a string
	public String getName() {
		return this.name.toString();
	}
	
	//This method increments player score by 1
	public void incrementScore() {
		this.score++;
	}
	
	
	
}
