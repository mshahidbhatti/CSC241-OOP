public class Product{
	String name;
	String id;
	double price;


	Product(String name, String id, double price){
		this.name=name;
		this.id=id;
		this.price=price;
	}

	public String toString(){
		return String.format("%s %s %.2f", id, name , price);
	}


	public boolean equals(Object other){
		Product temp=(Product)other;

		return this.id.equals(temp.id);
	
	}



}