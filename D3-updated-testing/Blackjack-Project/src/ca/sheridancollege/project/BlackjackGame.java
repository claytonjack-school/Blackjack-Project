package ca.sheridancollege.project;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author claytonjack
 */
public class BlackjackGame extends Game {

    private final CardGroup dealerHand = new CardGroup();
    private final CardGroup playerHand = new CardGroup();
    private final CurrentPlayer dealer = new CurrentPlayer("Dealer", dealerHand);
    private final CurrentPlayer player = new CurrentPlayer("Player", playerHand);
    private Deck deck = new Deck();

    public BlackjackGame(String name) {
        super(name);
    }

    public void start() {
        boolean playAgain = true;
        do {
            dealerHand.clear();
            playerHand.clear();
            deck = new Deck();

            play(dealer, player, deck);

            Scanner input = new Scanner(System.in);
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.println("Do you want to play again? (yes/no)");
                    String choice = input.nextLine().toLowerCase();
                    playAgain = choice.equals("yes");
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid input.");
                    input.nextLine();
                }
            }
        } while (playAgain);
        System.out.println("Thank you for playing!");
    }
    
    @Override
    public void play(CurrentPlayer dealer, CurrentPlayer player, Deck deck) {

        Scanner input = new Scanner(System.in);
        System.out.println("How much do you want to bet?");
        double bet;
        while (true) {
        try {
            bet = input.nextDouble();
            break;
        } catch (InputMismatchException e) {
            System.out.println("Please place a valid bet.");
            input.nextLine();
        }
    }
        
        input.nextLine();
        this.deck.deal(2, dealerHand);
        this.deck.deal(2, playerHand);

        System.out.println("\nPlayer's hands:");
        playerHand.printCards();

        System.out.println("\nChecking hand value...");
        System.out.println("Player's hand value: " + this.deck.calculateHandValue(playerHand));

        while (deck.calculateHandValue(player.getHand()) <= 21) { 

            System.out.println("\nDo you want to 'Hit' or 'Stay'?");
            String choice = (input.nextLine()); 
            
            if (choice.equalsIgnoreCase("hit")) {

                System.out.println("-----------------------------------------------------------------");
                deck.deal(1, player.getHand()); 

                System.out.println("\nCurrent hand:");
                playerHand.printCards();

                System.out.println("\nPlayer hand value: " + deck.calculateHandValue(player.getHand()));
                
                if (deck.calculateHandValue(player.getHand()) > 21) { 
                    declareWinner(dealer);
                    System.out.println("You lose $" + bet);
                    break;
                } else if (deck.calculateHandValue(player.getHand()) == 21) {
                    declareWinner(player);
                    System.out.println("You win $" + bet * 2);
                    break;
                }
            } 
            
            else if (choice.equalsIgnoreCase("stay")) { 
                System.out.println("\nDealer's hands:");
                dealerHand.printCards();
                System.out.println("Dealer hand value: " + deck.calculateHandValue(dealer.getHand()));

                while (deck.calculateHandValue(dealer.getHand()) < 17) { 

                    System.out.println("-----------------------------------------------------------------");
                    deck.deal(1, dealer.getHand());

                    System.out.println("\nCards in the player's hands: ");
                    playerHand.printCards();
                    System.out.println("Dealer draws a card, cards in the dealer's hands after hit: ");
                    dealerHand.printCards();

                    System.out.println("\nPlayer's hand value: " + deck.calculateHandValue(player.getHand()));
                    System.out.println("Dealer's hand value: " + deck.calculateHandValue(dealer.getHand()));
                }

                if (((deck.calculateHandValue(dealer.getHand())) > 21) || (deck.calculateHandValue(player.getHand()) > deck.calculateHandValue(dealer.getHand()))) {
                    declareWinner(player);
                     System.out.println("You win $" + bet * 2);
                    break;
                } else if (deck.calculateHandValue(player.getHand()) == deck.calculateHandValue(dealer.getHand())) {
                    declareWinner(null);
                    break;
                } else {
                    declareWinner(dealer);
                    System.out.println("You lose $" + bet);
                    break;
                }
            } 
        }
    }

    @Override 
    public void declareWinner(Player person) {
        if (person == null) {
            System.out.println("Push.");
        } else {
            System.out.println("\nThe " + person.getName() + " wins!");
        }
    }

}
