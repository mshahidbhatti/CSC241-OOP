public class Demo{

	public static void main(String args[]){

		Date d1=new Date();
		System.out.println(d1);
		d1.displayDate();
		
		Date d2=new Date(299,23,1231);
		d2.displayDate();

		Date d3=new Date(23,2026);
		d3.displayDate();
		Date d4=new Date(2026);
		d4.displayDate();

		A a=A.createA();

	}

}