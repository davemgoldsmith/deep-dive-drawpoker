package edu.cnm.deepdive.cards;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

  private ArrayList<Card> cards;
  private boolean shuffled;
  private Random rng = null;
  private int position;
  
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
  
  public void  shuffle ()  //shuffle method
		  throws NoSuchAlgorithmException { 
	  if (rng == null) {
		  rng = SecureRandom.getInstanceStrong();
	  }
	  Collections.shuffle(cards);
	  shuffled = true;
	  position = 0;
	  
  } // shuffle method
  
  public Card[] toArray () {  // toArray method
	  return cards.toArray(new Card[] {});
  }  //toArray method
  
  public Card draw() 
		  throws IndexOutOfBoundsException{
	  return cards.get(position++);	  
  } // draw method
  
  public Card[] draw(int numCards) 
		  throws IndexOutOfBoundsException{
	  Card[] hand = new Card[numCards];
	  for (int i = 0; i < hand.length; i++) {
		  hand[i] = draw();
	  } //end for
	  return hand;

  } // draw method
  
} // Deck class


