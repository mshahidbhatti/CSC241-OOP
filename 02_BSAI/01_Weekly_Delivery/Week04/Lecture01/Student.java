public class Student{
	String name;
	String id;
	double gpa;
	static int count=1;	

	{	System.out.println("Welcome to student class"); 
		this.id="SP26-BAI-"+ String.format("%03d",count++);
	}
	static{
	System.out.println("Even before code blocks");
	count++;
	}
	Student(String name, double gpa){
		System.out.println("Two argument constructor call");
		this.name=name;
		this.gpa=gpa;
	}
	public void display(){
	System.out.println("ID :"+id);
		System.out.println("Name :"+name);
	System.out.println("gpa :"+gpa);
	
	}

}// end of class