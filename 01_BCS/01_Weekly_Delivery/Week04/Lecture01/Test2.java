public class Test2{

	int x=10;
	Test2 obj;
	public static void main(String args[]){

		obj=new Test2();

		System.out.println(Math.pow(2,2));

		System.out.println(obj.x);

		Test2.nonSense();


	}


	public static void nonSense(){
		System.out.println("Non sense method");
		obj.a();
	}


	public void a(){}

}