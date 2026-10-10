public class Product{
	private String id;
	private String name;
	private double price;
	private int quantity;
	private Date md; 

	private static int counter=0;
	private static double minPrice;
	private static double maxPrice;

	Product(String name, double price, int quantity){
		this(name,price, quantity,new Date(1,1,1));
	}

	Product(String name, double price, int quantity, Date md){
		this.id=String.format("p%03d",counter++);
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.md=md;
		if(counter==1){
			minPrice=price;
			maxPrice=price;
		}	
		if(counter>1 && minPrice>price)
			minPrice=price;
		if(counter>1 && maxPrice<price)
			maxPrice=price;
	}


	public void display(){

		System.out.printf("ID : %-20s \n",id);
		System.out.printf("Name : %-20s \n",name);
		System.out.printf("Price : %.2f \n",price);
		System.out.printf("Quantity : %d \n",quantity);
		System.out.printf("MinPrice So far : %.2f \n",minPrice);
		System.out.printf("MaxPrice So far : %.2f \n",maxPrice);
		System.out.printf("Manufacturing Date : %s \n"," "+md.toString());



	}
	



}