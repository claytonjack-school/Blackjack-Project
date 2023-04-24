package ca.sheridancollege.project;

import java.util.NoSuchElementException;

/**
 *
 * @author claytonjack
 */
public class Deck extends CardGroup {

    Deck() {

        for (Suit value : Suit.values()) {
            for (Value value1 : Value.values()) {
                cards.add(new GamePlayingCard(value, value1));
            }
        }
        shuffle();
    }

    public void deal(int amount, CardGroup hand) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (cards.isEmpty()) {
            throw new NoSuchElementException("Deck is empty");
        }
        int lastIndex = cards.size() - 1;
        int start = lastIndex - amount;
        for (int i = lastIndex; i > start; --i) {
            hand.addCard(cards.get(i));
            cards.remove(i);
        }
    }

    public int calculateHandValue(CardGroup hand) {
        int total = 0;
        int[] array = new int[hand.deckSize()];
        for (int i = 0; i < array.length; i++) {
            array[i] = hand.cards.get(i).value.getNumValue();
            total += array[i];
        }
        
        int aceBonus = 0;
        for (int i = 0; i < array.length; i++) {
            if (hand.cards.get(i).value == Value.ACE && total < 12) {
                aceBonus = 10;
                break;
            }
        }
        
        return total + aceBonus;
    }

}
