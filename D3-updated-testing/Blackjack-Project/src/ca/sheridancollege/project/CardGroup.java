/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @modifier claytonjack
 */
public class CardGroup {

    protected ArrayList<Card> cards;
    
    public CardGroup() {
        cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card c) {
        cards.add(c);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void printCards() {
        int index = 0;
        for (Card c : cards) {
            index++;
            System.out.println(index + "  " + c);
        }
    }
    
    public void clear() {
        cards.clear();
    }

    public int deckSize() {
        return cards.size();
    }

}//end class
