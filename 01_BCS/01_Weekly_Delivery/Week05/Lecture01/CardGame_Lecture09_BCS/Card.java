public class Card {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void display() {
        System.out.println(rank + " of " + suit);
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
