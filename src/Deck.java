import java.util.*;

public class Deck {

	private List<Card> cards; //this is the deck of cards
	
	//Constructor
	public Deck() {
		this.cards = new ArrayList<Card>(); // initialize the deck of cards
		populateWithCards(this.cards);		// populate the deck with cards
	}
	
	//Private methods
	//This method populates the supplied list of cards with a full deck of 52 suited cards.
	private void populateWithCards(List<Card> deck) {
		for (int suitI = 0; suitI < 4; suitI++) { // Repeat four times, once for each suit of 13 cards
			
			StringBuilder suit = new StringBuilder("Clubs"); // StringBuilder to hold the current suit we are working on
			switch (suitI) { // Change the suit upon each iteration
			case 1:
				suit = new StringBuilder("Diamonds");
				break;
			case 2:
				suit = new StringBuilder("Hearts");
				break;
			case 3:
				suit = new StringBuilder("Spades");
				break;
			}
			
			for (int valueI = 0; valueI < 13; valueI++) { // repeat 13 times, instantiate each card with a value between 2-14, with the current suit we are working on
				
				deck.add(new Card(valueI + 2, suit.toString()));
				
			}
			
			
		}
	}
	
	//public methods
	
	//This method removes and returns the first card in the deck
	public Card draw() {
		
		return cards.remove(0);
		
	}
	
	// This method shuffles the deck (thanks Danyal)
	public void shuffle() {
		//Fisher-Yates shuffle
		
		Random random = new Random(); //Instantiate Random object so we can shuffle the deck
		
		// Start at the back, iterate until we hit the beginning
		// "i" is the current index, card at index "i" will be swapped with card at index "j".
		for (int i = cards.size() - 1; i > 0; i--) { 
			int j = random.nextInt(i + 1); // Pick new random index to swap with
			
			// Capture the card at each index
			Card cardAtIndexI = cards.get(i); 
			Card cardAtIndexJ = cards.get(j);
			
			//Swap the cards
			cards.set(i, cardAtIndexJ);
			cards.set(j, cardAtIndexI);
		}

		
	}
	
	
	//This method prints the descriptions of all cards in the deck (in order)
	public void describeAllCards() {
		for (Card currentCard : cards) {
			currentCard.describe();
		}
		
	}
	
}
