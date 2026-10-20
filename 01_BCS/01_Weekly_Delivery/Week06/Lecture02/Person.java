public class Person{

	String name;
	Address address;
	Date dob;

	Person(String name, Address address){
		this.name=name;
		this.address=address;
	}
	Person(String name, Date dob, Address address){
		this.name=name;
		this.address=address;
		this.dob=dob;
	}


}