import java.util.Random;

public class Deck {

    private Card[] cards;
    private int nextCard;

    public Deck() {
        cards = new Card[52];

        int index = 0;

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[index] = new Card(suit, rank);
                index++;
            }
        }

        nextCard = 0;
    }

    public void shuffle() {
        Random random = new Random();

        for (int i = 0; i < cards.length; i++) {
            int j = random.nextInt(cards.length);

            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }

        nextCard = 0;
    }

    public Card dealCard() {
        if (nextCard >= cards.length) {
            return null;
        }

        Card card = cards[nextCard];
        nextCard++;

        return card;
    }

    public int getRemainingCards() {
        return cards.length - nextCard;
    }
}
