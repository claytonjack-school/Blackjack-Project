/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author urban
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ca.sheridancollege.project.GroupOfCardsTest.class, ca.sheridancollege.project.CurrentPlayerTest.class, ca.sheridancollege.project.DeckTest.class, ca.sheridancollege.project.CardTest.class, ca.sheridancollege.project.ValueTest.class, ca.sheridancollege.project.BlackjackGameTest.class, ca.sheridancollege.project.GamesCardsTest.class})
public class ProjectSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
