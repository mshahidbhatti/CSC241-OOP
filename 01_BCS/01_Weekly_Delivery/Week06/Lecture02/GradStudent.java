public class GradStudent extends Student{

	String thesisTitle;
	

	GradStudent(String name, Date dob, Address address, String regNo, String thesisTitle){
		super(name, dob, address, regNo);
		this.thesisTitle=thesisTitle;
	}


}