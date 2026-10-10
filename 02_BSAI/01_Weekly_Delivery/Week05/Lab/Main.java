public class Main{


	public static void main(String args[]){

		Product p1=new Product("Keybboard",3000,4);
		p1.display();
		Product p2=new Product("Keybboard",4000,4);
		p2.display();
		Product p3=new Product("Keybboard",1000,4);
		p3.display();


		Product p4=new Product("Keybboard",1000,4, new Date(8,10,2026));
		p4.display();
	}

}