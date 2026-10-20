public class Student extends Person{
	String regNo;

	Student(String name, Date dob, Address address, String regNo){
		super(name, dob, address);
		this.regNo=regNo;
	}

}