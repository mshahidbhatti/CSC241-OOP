public class Demo{
	public static void main(String args[]){
		
		Card c1=new Card();
		c1.display();	
		
		c1.rank=4;
		c1.suit="Spades";
		c1.display();	

		

		int a=0;
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();

		System.out.println(r1);
	
		r1.length = 10;
		r1.width =10;

		System.out.println(r2);
		double area= r1.calArea();
		System.out.println("Area::"+area);

		
	}

}