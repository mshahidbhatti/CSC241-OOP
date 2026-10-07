public class Game {

    private Deck deck;
    private Player[] players;

    public Game(Player[] players) {
        this.players = players;
        this.deck = new Deck();
    }

    public void shuffleDeck() {
        deck.shuffle();
    }

    public void dealInitialCards() {
        for (int round = 0; round < 5; round++) {
            for (int i = 0; i < players.length; i++) {

                Card card = deck.dealCard();

                if (card != null) {
                    players[i].receiveCard(card);
                }
            }
        }
    }

    public void showPlayersCards() {
        for (int i = 0; i < players.length; i++) {
            players[i].showHand();
            System.out.println();
        }
    }

    public int getRemainingCards() {
        return deck.getRemainingCards();
    }
}
