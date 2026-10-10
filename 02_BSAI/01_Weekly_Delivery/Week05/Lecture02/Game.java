public class Game{

	Deck deck;

	Player players[];


	Game(Player players[]){

		deck=new Deck();
		deck.shuffle();

		this.players=players;

		for(int i=0;i<players.length;i++)
			{
				players[i].recieveCard(deck.dealCard());
			}

	

	}


	public void showPlayersCards(){
		
			for(int i=0;i<players.length;i++)

				players[i].showHand();
	}


}