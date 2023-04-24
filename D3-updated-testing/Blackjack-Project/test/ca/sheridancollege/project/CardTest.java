/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author urban
 */
public class CardTest {

    // Create a concrete Card subclass for testing purposes
    private class TestCard extends Card {
        TestCard(Suit suit, Value value) {
            super(suit, value);
        }

        @Override
        public String toString() {
            return value + " of " + suit;
        }
    }

    @Test
    public void testGoodGetSuit() {
        System.out.println("getSuit");
        TestCard instance = new TestCard(Suit.HEARTS, Value.ACE);
        Suit expResult = Suit.HEARTS;
        Suit result = instance.getSuit();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBadGetSuit() {
        System.out.println("getSuit");
        TestCard instance = new TestCard(Suit.HEARTS, Value.ACE);
        Suit expResult = Suit.SPADES;
        boolean result = instance.getSuit() == expResult;
        assertEquals(false,  result);
    }
    
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        TestCard instance = new TestCard(Suit.HEARTS, Value.ACE);
        Suit expResult = Suit.HEARTS;
        Suit result = instance.getSuit();
        assertEquals(expResult, result);
    }

    @Test
    public void testGoodGetValue() {
        System.out.println("getValue");
        TestCard instance = new TestCard(Suit.HEARTS, Value.ACE);
        Value expResult = Value.ACE;
        Value result = instance.getValue();
        assertEquals(expResult, result);
    }
   
    @Test
    public void testBadGetValue() {
        System.out.println("getValue");
        TestCard instance = new TestCard(Suit.HEARTS, Value.ACE);
        Value expResult = Value.TWO;
        boolean result = instance.getValue() == expResult;
        assertEquals(false, result);
    }

    @Test
    public void testGoodToString() {
        System.out.println("toString");
        TestCard instance = new TestCard(Suit.HEARTS, Value.ACE);
        String expResult = "ACE of HEARTS";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBadToString() {
        System.out.println("toString");
        TestCard instance = new TestCard(Suit.HEARTS, Value.ACE);
        String expResult = "TWO of HEARTS";
        boolean result = instance.toString().equals(expResult);
        assertEquals(false, result);
    }
}