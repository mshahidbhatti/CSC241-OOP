public class Card{

	private final String SUIT;
	private final String RANK;

	Card(String suit, String rank){
		this.SUIT=suit;
		this.RANK=rank;
	}

	public String getSUIT(){
		return SUIT;
	}

	public String getRANK(){
		return RANK;

	}

	public String toString(){
		return RANK+ " of " +SUIT; 

	}


}