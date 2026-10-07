public class Player {

    private String name;
    private Card[] hand;
    private int cardCount;

    public Player(String name) {
        this.name = name;

        hand = new Card[5];
        cardCount = 0;
    }

    public String getName() {
        return name;
    }

    public boolean receiveCard(Card card) {
        if (card == null) {
            return false;
        }

        if (cardCount >= hand.length) {
            return false;
        }

        hand[cardCount] = card;
        cardCount++;

        return true;
    }

    public void showHand() {
        System.out.println("Cards of " + name);

        for (int i = 0; i < cardCount; i++) {
            System.out.println((i + 1) + ". " + hand[i]);
        }
    }

    public int getCardCount() {
        return cardCount;
    }
}
