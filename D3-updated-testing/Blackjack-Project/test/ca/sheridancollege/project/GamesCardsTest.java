/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author claytonjack
 */
public class GamesCardsTest {

    /**
     * Test of toString method, of class GamesCards.
     */
    @Test
    public void testToStringGood() {
        System.out.println("toString Good");
        GamePlayingCard instance = new GamePlayingCard(Suit.CLUBS, Value.ACE);
        String expResult = "ACE of CLUBS";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testToStringBad() {
        System.out.println("toString Bad");
        GamePlayingCard instance = null;
        String expResult = null;
        String result = null;
        try {
            result = instance.toString();
        } catch (NullPointerException e) {
            assertNull(instance);
        }
        assertEquals(expResult, result);
    }

    @Test
    public void testToStringBoundary() {
        System.out.println("toString Boundary");
        GamePlayingCard instance = new GamePlayingCard(Suit.SPADES, Value.KING);
        String expResult = "KING of SPADES";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
