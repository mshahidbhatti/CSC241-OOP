public class Demo4{

	public static void main(String args[]){
		Student a=new Student();
		Student b=a;
		a.completedCredits=6;
		System.out.println(a.completedCredits);

		System.out.println(b.completedCredits);
		Student c=new Student();
		c.completedCredits=a.completedCredits;
		a.completedCredits=12;

		System.out.println(a.completedCredits);
		System.out.println(c.completedCredits);






	}

}