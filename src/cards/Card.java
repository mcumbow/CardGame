package cards;


/**
 * Card project
 *
 * <hr>
 * Date created: Oct 24, 2017
 * <hr>
 * @author Michael Cumbow
 */
public class Card
{
	private Face face;
	private Suit suit;
	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Sep 24, 2017 
	 *
	 * 
	 */
	public Card()
	{
		this.face = cards.Face.FOUR;
		this.suit = cards.Suit.CLUBS;
	}//end Card() no arg
	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Sep 24, 2017 
	 *
	 * 
	 */
	public Card(int n)
	{

		face = Face.values()[n % 13];
		suit = Suit.values()[n % 4];
	}//end Card(int)
	


	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Sep 24, 2017 
	 *
	 * 
	 * @param face
	 * @param suit
	 */
	public Card(Card existingCard)
	{

		this.face = existingCard.face;
		this.suit = existingCard.suit;
	}//end Card(Card)


	/**
	 * toString method      
	 *
	 * <hr>
	 * Date created: Sep 24, 2017 
	 *
	 * <hr>
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		return "[" + face + " Of " + suit + "]";
		
	}//end toString()
	

}//end Card class

