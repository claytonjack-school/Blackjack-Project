/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author urban
 */
public class CurrentPlayerTest {

    @Test
    public void testGoodGetName() {
        CurrentPlayer tester = new CurrentPlayer("John", new CardGroup());
        CardGroup hand = new CardGroup();
        hand.addCard(new GamePlayingCard(Suit.HEARTS, Value.ACE));
        hand.addCard(new GamePlayingCard(Suit.SPADES, Value.QUEEN));
        tester.setHand(hand);
        boolean result = tester.getName().equals("John");
        assertEquals(true, result);
    }
    
    @Test
    public void testBadGetName() {
        CurrentPlayer tester = new CurrentPlayer("John", new CardGroup());
        CardGroup hand = new CardGroup();
        hand.addCard(new GamePlayingCard(Suit.HEARTS, Value.ACE));
        hand.addCard(new GamePlayingCard(Suit.SPADES, Value.QUEEN));
        tester.setHand(hand);
        boolean result = tester.getName().equals("Jill");
        assertEquals(false, result);  
    }

    @Test
    public void testBoundGetName() {
        CurrentPlayer tester = new CurrentPlayer("", new CardGroup());
        CardGroup hand = new CardGroup();
        hand.addCard(new GamePlayingCard(Suit.HEARTS, Value.ACE));
        hand.addCard(new GamePlayingCard(Suit.SPADES, Value.QUEEN));
        tester.setHand(hand);
        boolean result = tester.getName().equals("");
        assertEquals(true, result);
    }

    @Test
    public void testGoodSetName() {
        CurrentPlayer tester = new CurrentPlayer("John", new CardGroup());
        CardGroup hand = new CardGroup();
        hand.addCard(new GamePlayingCard(Suit.HEARTS, Value.ACE));
        hand.addCard(new GamePlayingCard(Suit.SPADES, Value.QUEEN));
        tester.setHand(hand);
        
        tester.setName("Mike");
        boolean result = tester.getName().equals("Mike");
        assertEquals(true, result);
    }

    @Test 
    public void testBoundSetName() {
        CurrentPlayer tester = new CurrentPlayer("John", new CardGroup());
        CardGroup hand = new CardGroup();
        hand.addCard(new GamePlayingCard(Suit.HEARTS, Value.ACE));
        hand.addCard(new GamePlayingCard(Suit.SPADES, Value.QUEEN));
        tester.setHand(hand);

        tester.setName("#");
        boolean result = tester.getName().equals("#");
        assertEquals(true, result);
    }

    @Test
    public void testGoodGetHand() {
        CurrentPlayer tester = new CurrentPlayer("John", new CardGroup());
        CardGroup hand = new CardGroup();
        hand.addCard(new GamePlayingCard(Suit.HEARTS, Value.ACE));
        hand.addCard(new GamePlayingCard(Suit.SPADES, Value.QUEEN));
        tester.setHand(hand);
        
        boolean result = tester.getHand().equals(hand);
        assertEquals(true, result);
    }

    @Test
    public void testBadGetHand() {
        CurrentPlayer tester = new CurrentPlayer("John", new CardGroup());
        CardGroup hand = new CardGroup();
        hand.addCard(new GamePlayingCard(Suit.HEARTS, Value.ACE));
        hand.addCard(new GamePlayingCard(Suit.SPADES, Value.QUEEN));
        tester.setHand(hand);

        tester.setHand(new CardGroup());
        boolean result = tester.getHand().equals(hand);
        assertEquals(false, result);
    }

    @Test
    public void testGoodSetHand() {
        CurrentPlayer tester = new CurrentPlayer("John", new CardGroup());
        CardGroup hand = new CardGroup();
        hand.addCard(new GamePlayingCard(Suit.HEARTS, Value.ACE));
        hand.addCard(new GamePlayingCard(Suit.SPADES, Value.QUEEN));
        tester.setHand(hand);
        
        boolean result = tester.getHand().equals(hand);
        assertEquals(true, result);
    }

    @Test
    public void testBadSetHand() {
        CurrentPlayer tester = new CurrentPlayer("John", new CardGroup());
        CardGroup hand = new CardGroup();
        hand.addCard(new GamePlayingCard(Suit.HEARTS, Value.ACE));
        hand.addCard(new GamePlayingCard(Suit.SPADES, Value.QUEEN));
        tester.setHand(hand);

        tester.setHand(new CardGroup());
        boolean result = tester.getHand().equals(hand);
        assertEquals(false, result);
    }
}
