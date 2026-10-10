public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("Ali");
        Player p2 = new Player("Sara");

        Player[] players = {
            p1,
            p2
        };

        Game game = new Game(players);

        System.out.println("=== BEFORE SHUFFLE ===");
        System.out.println("Cards remaining: " + game.getRemainingCards());

        game.shuffleDeck();
        game.dealInitialCards();

        System.out.println();
        System.out.println("=== PLAYERS' HANDS ===");
        game.showPlayersCards();

        System.out.println("Cards remaining: " + game.getRemainingCards());
    }
}
