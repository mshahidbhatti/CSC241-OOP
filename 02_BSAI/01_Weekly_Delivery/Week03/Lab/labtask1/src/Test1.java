public class Test1{

	public static void main(String args[]){
		System.out.println("Application to find maximum number!");

		FindMaxPro ob1=new FindMaxPro();
		System.out.println("Maximum number is:"+ ob1.max(3,9.0f));
System.out.println("Maximum number is:"+ ob1.max('3','a'));

		System.out.println("Maximum number is:"+ ob1.max(3,'c'));
		System.out.println("Maximum number is:"+ ob1.max(3,ob1.max(4,9)));

		System.out.println("Maximum number is:"+ ob1.max(20.0,9.0));

		System.out.println("Maximum String is:"+ob1.max("Ahmad","Shahid"));


		// System.out.println("Maximum String is:"+ob1.max("Ahmad",'c'));


		

	}


}