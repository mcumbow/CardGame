/**
 * ---------------------------------------------------------------------------
 * File name: DeckDriver.java
 * Project name: Card
 * ---------------------------------------------------------------------------
 * Creator's name and email: Michael Cumbow, cumbowm@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Oct 23, 2017
 * ---------------------------------------------------------------------------
 */

package cards;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Driver for the Card Deck Application
 *
 * <hr>
 * Date created: Oct 23, 2017
 * <hr>
 * @author Michael Cumbow
 */
public class DeckDriver
{
	/**
	 *Driver for the Card Deck application.       
	 *
	 * <hr>
	 * Date created: Oct 23, 2017
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String [ ] args)
	{		
		ArrayList<Hand> playerHands = new ArrayList<Hand>();
		Scanner kb = new Scanner(System.in);
		Deck deck1 = new Deck();
		int iCards = 0;
		int iPlayers = 0;	
		
		do
		{
			System.out.println("How many cards are in one hand: ");
			iCards = kb.nextInt();
			if (iCards < 0)
			{
				iCards = 5;
			}
			
			System.out.println("How many players are playing: ");
			iPlayers=kb.nextInt();
			
			if (!ValidateHands(deck1, iCards, iPlayers))
			{
				System.out.println("There are not enough cards in the deck to deal " + iPlayers + " hands of " + iCards + " cards. Try again.\n");
			}
		} while (!ValidateHands(deck1, iCards, iPlayers));		
		
		deck1.shuffle ( );
		
		for (int i = 1; i <= iPlayers; i++)
		{
			playerHands.add (deck1.dealAHand (iCards));
		}
		
		for (int i = 1; i <= iPlayers; i ++)
		{
			System.out.println("Player " + i + ":");
			System.out.println(playerHands.get (i - 1).toString());
		}	
		kb.close ( );

		
	}
	
	private static Boolean ValidateHands(Deck deck, int handSize, int players)
	{
		if (handSize == 0 || players == 0)
		{
			return false;
		}
		
		return handSize * players < deck.cardsLeft ( );
	}

}
