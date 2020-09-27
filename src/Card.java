
public class Card {
	private int value; // contains a value from 2-14 representing cards. 2 = ace 
	private StringBuilder name; // Name of card, example: Ace of Diamonds, Two of Hearts
	
	// Constructors
	public Card() { //default constructor (wont be used, but figured I might as well add this.
		
		this.value = 2; //initialize value with first possible value
		this.name = new StringBuilder(); // instantiate StringBuilder
		
	}
	
	public Card(int initValue, String suit) { //takes two arguments, first is the value of the card, second is a String describing the suit of the card
		
		this.value = initValue; // initialize value with the passed in value argument
		StringBuilder face = selectFace(value);
		this.name = new StringBuilder(face + " of " + suit); // instantiate StringBuilder with the passed in arguments
		
	}
	
	
	//private methods
	// This method is used in the constructor to pick and return the face of the card, based on the value that was passed in.
	private StringBuilder selectFace(int value) {
		StringBuilder face = new StringBuilder(); // StrinBuilder to hold the name of the face value
		
		switch(value) {
		case 2:
			face.append("Ace");
			break;
		case 3:
			face.append("Two");
			break;
		case 4:
			face.append("Three");
			break;
		case 5:
			face.append("Four");
			break;
		case 6:
			face.append("Five");
			break;
		case 7:
			face.append("Six");
			break;
		case 8:
			face.append("Seven");
			break;
		case 9:
			face.append("Eight");
			break;
		case 10:
			face.append("Nine");
			break;
		case 11:
			face.append("Ten");
			break;
		case 12:
			face.append("Jack");
			break;
		case 13:
			face.append("Queen");
			break;
		case 14:
			face.append("King");
			break;
		}
		
		return face;
	}
	
	
	//public methods
	
	//This method gets the name of the card
	public StringBuilder getName() { 
		
		return this.name;
		
	}
	
	//This method sets the name of the card
	public void setName(StringBuilder name) { 
		
		this.name = name;
		
	}
	
	//This method gets the value of this card
	public int getValue() { 
		
		return this.value;
		
	}
	
	// This method sets the value of the card
	public void setValue(int value) { 
		
		this.value = value; 
		
	}
	
	
	// This method describes the card, printing to console the value and name.
	public void describe() {
		System.out.println("Name: " + this.name + " || Value: " + this.value );
	}
	
	
}
