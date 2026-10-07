import java.util.Random;
public class Deck{

	Card cards[];

	String suits[]={"Spades","Clubs","Diamonds","Hearts"};
	String ranks[]={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};


	Deck(){
		int counter=0;
		cards=new Card[52];
		for(int i=0;i<suits.length;i++)
			for(int j=0;j<ranks.length;j++)
				cards[counter++]=new Card(suits[i],ranks[j]);
		
		
	}

	public void display(){
		for(int i=0;i<cards.length;i++)
			cards[i].display();


	}
	public void shuffle(){
		Random ran=new Random();
		for(int i=0;i<7000;i++){
			int r=ran.nextInt(52);

			Card temp=cards[r];
			cards[r]=cards[0];
			cards[0]=temp;
			//System.out.println(r);
		}
	
	}


}