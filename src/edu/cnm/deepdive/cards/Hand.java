/**
 * 
 */
package edu.cnm.deepdive.cards;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * the <code>Hand</code> class encapsulates a set of cards drawn from a 
 * given deck.
 * 
 * @author davem
 *
 */
public class Hand implements Comparable <Hand>{
	
	private final Deck deck;
	private final int size;
	private final ArrayList<Card> cards;
	
	/**
	 * Initialize the hand by drawing <code>Size</code> {@link Card card}
	 * instances from <code>Deck</code>
	 * @param deck  Source of cards in the hand.
	 * @param size  Number of cards drawn for the hand.
	 */
	public Hand(Deck deck, int size) {
		this.deck = deck;
		this.size = size;
		cards = new ArrayList<>(Arrays.asList(deck.draw(size)));
		
	} //Hand Constructor

	@Override
	public int compareTo(Hand o) {
		// TODO Auto-generated method stub
		return 0;
	}

} // Hand class
