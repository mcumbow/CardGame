/**
 * ---------------------------------------------------------------------------
 * File name: Hand.java
 * Project name: CumbowMichaelProject2A
 * ---------------------------------------------------------------------------
 * Creator's name and email: Michael Cumbow, cumbowm@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Oct 29, 2017
 * ---------------------------------------------------------------------------
 */

package cards;
import java.util.ArrayList;

/**
 * Hand of Cards 
 *
 * <hr>
 * Date created: Oct 29, 2017
 * <hr>
 * @author Michael Cumbow
 */
public class Hand
{
	private ArrayList<Card> hand = new ArrayList<Card>(52);
	private int handSize;		//handSize for default set to 5
	private int cardsInHand;	//cardsInHand card count

	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Oct 29, 2017 
	 *
	 * 
	 */
	public Hand () //No arg
	{
		this.cardsInHand = 0;
		this.handSize = 5;
	}//end Hand()
	
	public Hand (int handSize)
	{
		this.cardsInHand = 0;
		
		if (handSize > 52)
		{
			System.out.println("Error");
			handSize = 0;
		}		
		
		this.handSize = handSize;
	}//end Hand(int)
	
	public Hand (Hand handIn)
	{
		this.hand = handIn.hand;
		this.handSize = handIn.handSize;
		this.cardsInHand = handIn.cardsInHand;
	}//end Hand(Hand)
	
	public void addCard (Card card)
	{
		if (this.cardsInHand >= 52)
		{
			System.out.println("Error, Not enough cards.");
		}
		else
		{
			this.hand.add (card);
			this.cardsInHand++;
		}
	}//end addCard(Card)
	
	public String toString ( )
	{
		String strInfo = "";
		
		for (Card card: hand)
		{
			strInfo += "\t" + card.toString() + "\n";
		}		

		return strInfo;
	}//end toString()

}//end Hand Class
