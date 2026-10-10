public class Player{
	String name;
	Card hand[];

	int cardCount;


	Player(String name){

		this.name=name;

		hand=new Card[5];
	}

	public String getName(){
		return name;

	}

	public void showHand(){
		for(int i=0;i<hand.length;i++)
			if(hand[i]!=null)
				System.out.println(hand[i]);

	}

	public boolean recieveCard(Card card){
		if(cardCount<hand.length){
			hand[cardCount++]=card;
			return true;
		}
		else
			return false;
	}



}