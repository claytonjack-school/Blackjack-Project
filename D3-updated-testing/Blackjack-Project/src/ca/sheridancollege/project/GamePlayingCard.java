package ca.sheridancollege.project;
/**
 *
 * @author claytonjack
 */
public class GamePlayingCard extends Card{
    public GamePlayingCard(Suit suit, Value value)
    {
        super(suit,value);
    }
    
    @Override
    public String toString(){
        return getValue() + " of " + getSuit();
    }
}
