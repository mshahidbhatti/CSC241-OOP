public class Demo{

	public static void main(String args[]){

		Date d1=new Date();

		 Person p1=new Person("Zunnurain","email@email.com",d1,"Lahore");
		 Person p2=new Person("Sheraz","email@email.com",d1);

		p1.display();
		p2.display();

		// Person p2=new Person();

	}

}