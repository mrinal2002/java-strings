import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static String[] deck = new String[suits.length * ranks.length];

    static void initializeDeck() {
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
    }

    static void shuffleDeck() {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    static void distributeCards(int numCards, int numPlayers) {
        if (numCards * numPlayers > deck.length) {
            System.out.println("Not enough cards.");
            return;
        }
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < numCards; j++) {
                System.out.print(deck[i + j * numPlayers] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPlayers = scanner.nextInt();
        int numCards = scanner.nextInt();
        scanner.close();

        initializeDeck();
        shuffleDeck();
        distributeCards(numCards, numPlayers);
    }
}
