
import java.util.Random;

public class Deck_Of_Card_game {
    
    // Suits and ranks
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                                          "Jack", "Queen", "King", "Ace"};
    
    //Initialize deck
    public static String[] initializeDeck() {
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    
    //Shuffle deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        Random random = new Random();
        
        for (int i = 0; i < n; i++) {
            // Generate random card number between i and n-1
            int randomCardNumber = i + random.nextInt(n - i);
            // Swap current card with random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    
    //  Distribute cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers) {
        int numOfCards = deck.length;
        
        // Check if cards can be distributed evenly
        if (numOfCards % numPlayers != 0) {
            throw new IllegalArgumentException("Cannot distribute " + numOfCards + 
                " cards evenly to " + numPlayers + " players!");
        }
        
        int cardsPerPlayer = numOfCards / numPlayers;
        String[][] playersCards = new String[numPlayers][cardsPerPlayer];
        
        int cardIndex = 0;
        for (int player = 0; player < numPlayers; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                playersCards[player][card] = deck[cardIndex++];
            }
        }
        return playersCards;
    }
    
    // Print players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        System.out.println("\n--- Players' Cards ---");
        for (int player = 0; player < playersCards.length; player++) {
            System.out.println("\nPlayer " + (player + 1) + ":");
            for (String card : playersCards[player]) {
                System.out.println("  " + card);
            }
        }
    }

    //here we create main method
    
    public static void main(String[] args) {
        // Initialize deck
        System.out.println("Initializing deck...");
        String[] deck = initializeDeck();
        System.out.println("Total cards: " + deck.length + "\n");
        
        // Shuffle deck
        System.out.println("Shuffling deck...");
        deck = shuffleDeck(deck);
        System.out.println("Deck shuffled!\n");
        
        // Distribute cards (52 cards to 4 players)
        int numPlayers = 4;
        try {
            String[][] playersCards = distributeCards(deck, numPlayers);
            printPlayersCards(playersCards);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
