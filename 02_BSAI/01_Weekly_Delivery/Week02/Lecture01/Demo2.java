public class Demo2{

	public static void main(String args[]){
		Circle c1= new Circle();
		// c1.radius=-30;  //

		c1.setNewRadius(30);

		Circle c2=new Circle();
		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
	System.out.println("Area of C1:"+c1.calArea());

	}

}