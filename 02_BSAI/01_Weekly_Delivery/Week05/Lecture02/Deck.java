import java.util.Random;

public class Deck{

	private Card cards[];

	private String suits[]={"Spades","Clubs","Diamonds","Hearts"};
private String 	ranks[]={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

	private int nextCard=0;

	Deck(){
		cards=new Card[52];
		int counter=0;
		for(int i=0;i<suits.length;i++)
			for(int j=0;j<ranks.length;j++)
				cards[counter++]=new Card(suits[i], ranks[j]);

	}


	public void shuffle(){
		Random ran=new Random();
		
		for(int i=0;i<100000;i++){
			int temp=ran.nextInt(52);
			Card t=cards[0];
			cards[0]=cards[temp];
			cards[temp]=t;
		}
			

	}



	public void displayDeck(){
		for(int i=0;i<cards.length;i++)
			System.out.println(cards[i]);
	}	

	public Card dealCard(){
		if(nextCard<52)
			return cards[nextCard++];
		else 
			return null;

	}

	public int remainingCards(){
		return cards.length-nextCard;

	}


}