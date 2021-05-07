/**
 * ---------------------------------------------------------------------------
 * File name: Deck.java
 * Project name: Card
 * ---------------------------------------------------------------------------
 * Creator's name and email: Michael Cumbow, cumbowm@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Oct 23, 2017
 * ---------------------------------------------------------------------------
 */

/**
 *Cards project Project2A
 *
 * <hr>
 * Date created: Oct 23, 2017
 * <hr>
 * @author Michael Cumbow
 */

package cards;

import java.util.ArrayList;
import java.util.Random;
public class Deck
{

	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Oct 23, 2017 
	 *
	 * 
	 */
	private ArrayList<Card> deck = new ArrayList<Card>(52);	//Card Array called deck
	private int nextCard;				//Variable to set to count every time a card is dealt
	
	
	public Deck ( )						//starts no arg constructor. 
	{
		nextCard = 0;
		for (int i = 0; i < 52; i++)
		{
			deck.add (i, new Card(i+1));
		}
	}//end Deck() no arg
	
	public Deck(Deck existingDeck)		// copy of Deck
	{
		for (int i=0; i < 52; i++ )
		{
			Card cCard  = new Card(existingDeck.deck.get (i));
			deck.add (cCard);
		}
	}//end Deck (Deck)
	
	public void shuffle()				//Begin of shuffle method
	{
		nextCard = 0;
		
		int index;
		Card temp;
	    Random random = new Random();
	    
	    for (int i = deck.size ( ) - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        temp = deck.get (index);
	        deck.set (index, deck.get (i));
	        deck.set (i, temp);
	    }
	}//end of shuffle()
	
	public int cardsLeft()
	{
		int iCards = 52 - nextCard;		
		
		return iCards;
	}
	
	public Card dealACard()				//Start of dealACard()
	{
		if (nextCard < 51)
		{
			nextCard++;
		}
		return deck.get (nextCard);
	}//end dealACard()

	
	public Hand dealAHand(int handSize)		//start of dealAHeand(int)
	{
		Hand deckHand = new Hand(handSize);
		
		for (int i=0; i <handSize; i++)
		{
			if (nextCard < 51)
			{
				nextCard++;
			}
			
			deckHand.addCard (deck.get (nextCard));						
			
			deck.remove(nextCard);	
		}
		
		return deckHand;
	}//end dealAHand(int)
	
	@Override
	public String toString()				//start toString() method
	{
		String strInfo = " ";
		for (int i = 0 ; i < 52; i++)
		{
			strInfo += "card " + (i+1) +": " + deck.get (i) + "\n";
		}
			return strInfo;
	}//end toString method
}//end Deck class
