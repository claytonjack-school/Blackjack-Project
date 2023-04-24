/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

/**
 *
 * @author claytonjack
 */
public class BlackjackGameTest {
    /**
     * Test of winningResult method, of class Blackjack.
     */
    @Test
    public void testWinningResultBad() {
        System.out.println("winningResult Bad");
        Player person = null;
        BlackjackGame instance = new BlackjackGame("bad");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        instance.declareWinner(person);
        String expectedOutput = "Push.\n";
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }

    @Test
    public void testWinningResultGood() {
        System.out.println("winningResult Good");
        Player person = new CurrentPlayer("John", new CardGroup());
        BlackjackGame instance = new BlackjackGame("good");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        instance.declareWinner(person);
        String expectedOutput = "\nThe John wins!\n";
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }

    @Test
    public void testWinningResultBoundary() {
        System.out.println("winningResult Boundary");
        Player person = new CurrentPlayer("", new CardGroup());
        BlackjackGame instance = new BlackjackGame("boundary");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        instance.declareWinner(person);
        String expectedOutput = "\nThe  wins!\n";
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
   
}
