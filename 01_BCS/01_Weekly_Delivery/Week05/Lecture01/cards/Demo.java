public class Demo{

	public static void main(String args[]){
		
		Card c1=new Card("Spades","2");
		c1.display();


		Deck deck=new Deck();

//		deck.display();

	//	System.out.println(deck.cards.length);
	//	System.out.println(deck.cards[0]);
	 // System.out.println(deck.cards[1]);

		deck.shuffle();	
		deck.display();	

	}


}