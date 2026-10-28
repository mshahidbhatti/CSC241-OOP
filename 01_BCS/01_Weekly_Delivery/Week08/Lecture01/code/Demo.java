public class Demo{

	public static void main(String args[]){

		//VAR t=0;
		Rectangle r1= new Rectangle(5,10);
		Rectangle r2= new Rectangle(5,11);


		Integer i=40;
		Object temp=new Object();
		temp=i;

		i=(Integer)temp;

		//r2=r1;

		double a=10.0;
		int b=5;

		//a=b;  // upcasting  which is implicit
		b=(int)a;   // downcasting should be explicitly 

		// this = (Rectangle)o;


		if(r1==r2)
			System.out.println("Both rectangles are equal");
		else
			System.out.println("Both rectangles are not equal"); 


		if(r2.equals(r1))
			System.out.println("Both rectangles are equal");
		else
			System.out.println("Both rectangles are not equal");


		Product p=new Product();

		if(p.equals(new Product()))
			System.out.println("Both Products are equal");

		
		System.out.println(p);

	}

}