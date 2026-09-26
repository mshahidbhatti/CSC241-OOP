public class Demo{

	public static void main(String args[]){

		Date d1=new Date();  // constructor invoked 
		d1.displayDate();
		d1.setDay(10);
		
		int day=d1.getDay();

		System.out.println(d1);

		Date d2=new Date(2,11,2030);
		d2.displayDate();
		System.out.println();
		Date d3=new Date(2020);
		d3.displayDate();
		


	}
}