/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @modifier claytonjack
 */
public class Player {

    private String playerName;
    private CardGroup playerHand;
   
    public Player(String name, CardGroup hand) {
        this.playerName = name;
        this.playerHand= hand;
    }

    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        this.playerName = name;
    }

    public CardGroup getHand()
    {
        return playerHand;
    }
    
    public void setHand(CardGroup hand){
        this.playerHand = hand;
    }
}
