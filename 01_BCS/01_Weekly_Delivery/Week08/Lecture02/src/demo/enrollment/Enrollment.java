package demo.enrollment;

import demo.students.Student;

public class Enrollment {
    private Student student;

    public Enrollment(String name, String registrationNumber) {
        // Enrollment creates and owns the Student object: this models composition.
        this.student = new Student(name, registrationNumber);
    }

    public void printRecord() {
        student.introduce();
        student.showDetails();
        // student.name is not accessible here: Enrollment is neither a subclass
        // nor in Person's package. Use Student's public methods instead.
    }
}
