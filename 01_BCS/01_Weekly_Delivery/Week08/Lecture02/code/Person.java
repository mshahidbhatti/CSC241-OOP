public class Person extends Object{

	String name;
	

	


	Person(String name){
		super();
		this.name=name;
	}


	public final void finalMethod(){

	}


	@Override
   public String toString()
   {

	return String.format("%s %s ", super.toString(), name);

   }

	public  String getClassName(){
		return getClass().getName();
	}


	public static void method1(){
		System.out.println("Static method");
	}




 	

}