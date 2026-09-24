public class Test{

	public static void main(String args[]){
		System.out.println("Application to find maximum number!");

		FindMax ob1=new FindMax();
		System.out.println("Maximum number is:"+ ob1.maxInt(3,9));

		System.out.println("Maximum number is:"+ ob1.maxDouble(20.0,9.0));

		System.out.println("Maximum String is:"+ob1.maxString("Ahmad","Shahid"));


		

	}


}