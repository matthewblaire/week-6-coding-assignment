
public class App {

	public static void playGame() {
		
		Deck playDeck = new Deck(); //instantiate deck
		playDeck.shuffle(); //shuffle it
		
		Player p1 = new Player("Bob"); //make two players
		Player p2 = new Player("John");
		
		// Iterates 52 times, once for each card in the deck. Splits the cards in the deck evenly between players, adding to their hand.
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.draw(playDeck);
			} else {
				p2.draw(playDeck);
			}
		}
		
		//Iterates 26 times, compares the player's current card and adds a point to whoever had the highest value
		for (int i = 0; i < 26; i++) {
			Card p1Card = p1.flip(); // 
			Card p2Card = p2.flip(); // placeholders for each player's current card
			
			if (p1Card.getValue() != p2Card.getValue()) {  //Make sure nobody gets a point if the cards are equal
				if (p1Card.getValue() > p2Card.getValue()) { //if player 1's card is higher value, give player 1 a point
					p1.incrementScore();
				} else {									//otherwise, give player 2 a point
					p2.incrementScore();
				}
			}
		}
		
		//Deciding who wins
		if (p1.getScore() > p2.getScore()) {
			System.out.println("Player 1 ( " + p1.getName() +" ) wins with " + p1.getScore() + " points! Player 2 ( " + p2.getName() + " ) had " + p2.getScore() + " points.");
		} else if (p1.getScore() == p2.getScore()) {
			System.out.println("Draw! Player 1 ( "+ p1.getName() +" ) had " + p1.getScore() + " points, and so did player 2 ( " + p2.getName() + " ).");
		} else {
			System.out.println("Player 2 ( " + p2.getName() +" ) wins with " + p2.getScore() + " points! Player 1 ( " + p1.getName() + " ) had " + p1.getScore() + " points.");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Game 1:");
		playGame();
		System.out.println("Game 2:");
		playGame();
		System.out.println("Game 3:");
		playGame();
		System.out.println("Game 4:");
		playGame();
		System.out.println("Game 5:");
		playGame();

	}

}
