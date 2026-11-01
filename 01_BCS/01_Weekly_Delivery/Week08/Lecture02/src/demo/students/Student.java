package demo.students;

import demo.people.Person;

public class Student extends Person {
    private String registrationNumber;

    public Student(String name, String registrationNumber) {
        super(name);
        this.registrationNumber = registrationNumber;
    }

    public void showDetails() {
        // name is inherited as protected and is accessible in this subclass,
        // even though Student is in a different package from Person.
        System.out.println("Inherited name: " + name);
        System.out.println("Registration: " + registrationNumber);
    }
}
