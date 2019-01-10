package Activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		String[] ranks = {"king","queen","jack"};
		String[] suits = {"clubs","diamonds","heats"};
		int[] pointValues = {10,12,9};
		Deck firstDeck = new Deck(ranks, suits, pointValues);
        firstDeck.isEmpty();
        firstDeck.size();
        firstDeck.deal();
        firstDeck.toString();

        String[] ranks2 = {"nine","three","seven"};
        String[] suits2 = {"spades","diamonds","clubs"};
        int[] pointValues2 = {10,12,9};
        Deck secDeck = new Deck(ranks2, suits2, pointValues2);
        secDeck.isEmpty();
        secDeck.size();
        secDeck.deal();
        secDeck.toString();


        String[] ranks3 = {"nine","three","seven"};
        String[] suits3 = {"spades","diamonds","clubs"};
        int[] pointValues3 = {10,12,9};
        Deck thirdDeck = new Deck(ranks3, suits3, pointValues3);
        thirdDeck.isEmpty();
        thirdDeck.size();
        thirdDeck.deal();
        thirdDeck.toString();
    }
}

