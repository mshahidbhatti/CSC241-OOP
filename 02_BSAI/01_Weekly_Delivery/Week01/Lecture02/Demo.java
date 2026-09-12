public class Demo{
	public static void main(String args[]){
		// Rectangle r1=null;
		Rectangle r1=new Rectangle();
		System.out.println(r1);
		r1.length=10;
		r1.width=10;
		double area=r1.calArea();
		System.out.println(area);

	}

}