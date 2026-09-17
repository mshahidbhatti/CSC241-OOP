public class Demo1{

	public static void main(String args[]){
		Circle c1= new Circle();
		Circle c2=new Circle();
		System.out.println(c1);
		System.out.println(c2);
		System.gc();  // garbage collector

		c1=c2;
		
		c1.radius=-30;
		System.out.println(c1+" "+c1.radius);
		System.out.println(c2+" "+c2.radius);

		Circle c3=null;
		System.out.println(c3);

	}

}