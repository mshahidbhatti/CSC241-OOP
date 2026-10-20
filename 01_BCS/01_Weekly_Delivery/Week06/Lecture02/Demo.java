public class Demo{

	public static void main(String args[]){
		Address address=new Address("Lahore","Pakistan");

		Person p1=new Person("Bilal" , address);
		Person p2=new Person("Mubashira" , new Address("LHR","Pakistan"));

	Person p3=new Person("Fatima", new Date(1,1,1),new Address("ISL","PK"));
		p1=null;

	Student std1=new Student("Zain",new Date(2,2,2),new Address("ABC","Count"),"SP26");

	GradStudent gstd1=new GradStudent("Talha",new Date(3,3,3),new Address("city","country"),"sp26","research title");


	}

}