public class A{

	static A obj;

	private A(){
		obj=new A();
	}


	public static A createA(){
		return obj;
	}


	
}