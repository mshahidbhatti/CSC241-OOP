public class ShapesDemo{


	public static void main(String args[]){
		Shape shape1=new Shape("Unknown",2);
		Shape shape2=new Shape("Unknown",2);
		int a=10;
		double d=20;

		a=(int)d; // expkitcit type casting using cast operster (type)
		// d=a;  //implicit type casting
		System.out.println(shape1);

		System.out.println(shape1.equals(shape2));

		Shape2D shape2d=new Shape2D("2D", 3, "Empty");						System.out.println(shape2d);	
		Circle circle=new Circle("Circle", 3, "Empty",30);
		System.out.println(circle);
		

	
		
	}

}