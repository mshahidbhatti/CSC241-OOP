import java.util.ArrayList;

public class Demo{

	public static void main(String args[]){
		Product arr[]=new Product[100];


		ArrayList<Product> products=new ArrayList<>();

		products.add(new Product("led","001",20000));
		products.add(new Product("TV","002",50000));

		products.add(1, new Product("Laptop","003",50000));

		System.out.println(products.toString());

		System.out.println(products.size());
		System.out.println(products.indexOf(new Product("Laptop","003",50000)));


		if(products.contains(new Product("Laptop","003",50000))){
			System.out.println("Product found");
		}
		else
			System.out.println("Product not found");




		ArrayList<Product> list2=new ArrayList<>(products);





		


		
		

	




	}

}