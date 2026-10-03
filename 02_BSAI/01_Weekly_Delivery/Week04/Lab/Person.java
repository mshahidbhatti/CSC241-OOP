public class Person{

	private String id;
	private String name;
	private String email;
	// private String dob;
	private Date dob;
	private String city;

	public Person(String name, String email){
		this(name,email,null);
	}


	public Person(String name, String email, Date dob){
		this.name=name;
		this.email=email;
		this.dob=dob;
	}



	public Person(String name, String email, Date dob, String city){
		this.name=name;
		this.email=email;
		this.dob=dob;
		this.city=city;
	}

	public void display(){
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		dob.displayDate();
		System.out.println("city : "+city);

	}


}