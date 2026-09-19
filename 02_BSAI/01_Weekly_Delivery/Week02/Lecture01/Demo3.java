public class Demo3{

	public static void main(String args[]){
		Student a=new Student();
		a.name="Ali";
		Student b=a;
		b.name="Sara";
		a.completedCredits=6;
		System.out.println(a.name);

		System.out.println(b.name);
		System.out.println(a);

		System.out.println(b);
		Student c=new Student();
		c.name=a.name;
		c.completedCredits=a.completedCredits;
		a.completedCredits=12;
		System.out.println(c.name);
		System.out.println(c);






	}

}