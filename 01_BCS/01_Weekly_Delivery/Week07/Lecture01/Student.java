class Student extends Person {
    private String registrationNo;
    private String program;

    public Student(String name, int age,
                   Date dateOfBirth,
                   Address address,
                   String registrationNo,
                   String program) {

        super(name, age, dateOfBirth, address);

        this.registrationNo = registrationNo;
        this.program = program;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public String getProgram() {
        return program;
    }

    @Override
    public void display() {
        super.display();

        System.out.println("Registration No: " + registrationNo);
        System.out.println("Program: " + program);
    }
}


public class Demo {
    public static void main(String[] args) {

        Date dob = new Date(15, 8, 2005);

        Address address =
                new Address("H-17", "Defence Road", "Lahore");

        Student student = new Student(
                "Ali",
                21,
                dob,
                address,
                "FA26-BCS-001",
                "BS Computer Science"
        );

        student.display();
    }
}