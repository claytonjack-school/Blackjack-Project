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
public class ValueTest {
    /**
     * Test of getNumValue method, of class Value.
     */
    @Test
    public void testGoodGetNumValue() {
        System.out.println("good getNumValue test");
        Value instance = Value.FIVE;
        int expResult = 5;
        int result = instance.getNumValue();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBadGetNumValue() {
        System.out.println(" bad getNumValue test");
        Value instance = Value.FOUR;
        int expResult = 5;
        int result = instance.getNumValue();
        assertNotEquals(expResult, result);
    }
    
}
