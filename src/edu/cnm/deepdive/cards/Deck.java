package edu.cnm.deepdive.cards;

/**
 * Class that creates the deck of cards.
 * @author davem
 *
 */

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Deck class that creates the deck of cards.
 */
public class Deck {

  private ArrayList<Card> cards;
  private boolean shuffled;
  private Random rng = null;
  private int position;
  
  
  /**
   * Deck Constructor that builds the deck.
   */
  public Deck() {
	  
	  super();
	  cards = new ArrayList<>();
	  for (Card.Suit suit : Card.Suit.values())  {
		  for (Card.Rank rank : Card.Rank.values())  {
			  Card card = new Card(suit, rank);
			  cards.add(card);
		  } //for
	  } //for
	  shuffled = false;
	  position = 0;
  } // Deck constructor
  
  /**
   *  shuffle method.
   *  Throws NoSuchAlgorithmException if unable to instantiate a secure random shuffle/sort.
   */
  public void  shuffle ()  //shuffle method
		  throws NoSuchAlgorithmException { 
	  if (rng == null) {
		  rng = SecureRandom.getInstanceStrong();
	  }
	  Collections.shuffle(cards);
	  shuffled = true;
	  position = 0;
	  
  } // shuffle method
  
  /**
   * toArray method - Return an array containing all cards in the <code>Deck</code> instance>,
   * in the current order.
   * @return  All cards in deck as an array
   */
  public Card[] toArray () {  // toArray method
	  return cards.toArray(new Card[] {});
  }  //toArray method
  
  /**
   * Draw and returns the top {@link Card card} from the deck.
   * @return  Card at the top of the <code>Deck</code>.
   * @throws IndexOutOfBoundsException  Thrown when no cards remain in the deck.
   */
  public Card draw() 
		  throws IndexOutOfBoundsException{
	  return cards.get(position++);	  
  } // draw method
  
  /**
   * Draw and return the top <code>numCards</code>
   * @param numCards  number of cards to draw
   * @return    Cards drawn.
   * @throws IndexOutOfBoundsException  Thrown when fewer than the requested number 
   * 									of cards are in the deck
   */
  public Card[] draw(int numCards) 
		  throws IndexOutOfBoundsException{
	  Card[] hand = new Card[numCards];
	  for (int i = 0; i < hand.length; i++) {
		  hand[i] = draw();
	  } //end for
	  return hand;

  } // draw method
  
} // Deck class


