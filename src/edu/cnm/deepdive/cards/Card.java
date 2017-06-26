/**
 * 
 */
package edu.cnm.deepdive.cards;

/**
 * @author davem
 *
 */
public class Card implements Comparable <Card> {
	
	/**
	 * Suit field for cards
	 */
	public final Suit suit;
	/**
	 * Rank field for cards
	 */
	public final Rank rank;
	
	/**
	 * Constructor that returns the suit and rank fields
	 * @param suit  suit of cards (Club, Diamonds, Hearts, Spades)
	 * @param rank  rank of card (Ace through King)
	 */
	public Card(Suit suit, Rank rank)  { 	//Constructor
	this.suit = suit;
	this.rank = rank;
	}
	public String toString() {
		return rank.toString() + suit.toString();
	}
	
	@Override
	public int compareTo(Card card) {
		int suitComparison = this.suit.compareTo(card.suit);
		if (suitComparison != 0 ) {
			return suitComparison;
		}
		return this.rank.compareTo(card.rank);
	}
	/**
	 * Enum to build CLUBS, DIAMONDS, HEARTS AND SPADES
	 */
	public enum Suit {
		CLUBS,
		DIAMONDS,
		HEARTS,
		SPADES;
		
		public String toString() { //toString method
		 String value = null;
		 switch (this) {
		 case CLUBS:
			 value = "\u2663";
			 break;
		 case DIAMONDS:
			 value = "\u2666";
			 break;
		 case HEARTS:
			 value = "\u2665";
			 break;
		 case SPADES:
			 value = "\u2660";
			 break;
		 } //end switch
		 return value;
		} // end enum
	} // end toString method
	
	/**
	 * enum that builds the ranks of cards, Ace through King
	 */
	public enum Rank {
		ACE(1, 'A'),
		TWO(2, '2'),
		THREE(3, '3'),
		FOUR(4, '4'),
		FIVE(5, '5'),
		SIX(6, '6'),
		SEVEN(7, '7'),
		EIGHT(8, '8'),
		NINE(9, '9'),
		TEN(10, 'T') {
			public String toString(){
				return "10";
			}
		},
		JACK(10, 'J'),
		QUEEN(10, 'Q'),
		KING(10, 'K');
	
	/**
	 *   Sets up the value in unicode.
	 */
	public final int value;
	/**
	 * Sets up the symbol related to the suit of the card.
	 */
	public final char symbol;
	
	private Rank(int value, char symbol) { //constructor
		this.value = value;
		this.symbol = symbol;		
	} //Rank
	public String toString () {
		return new StringBuilder().append(symbol).toString();
		
	} // String Class
	} //public enum Rank

	
} //Card class
