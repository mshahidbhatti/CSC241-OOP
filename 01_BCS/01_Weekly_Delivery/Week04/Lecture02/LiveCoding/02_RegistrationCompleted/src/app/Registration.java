package app;
import model.Student;
import model.CourseSection;
import model.Enrollment;
public class Registration {
    public Enrollment register(Student student, CourseSection section) {
        // This demo supports one current enrollment per student.
        if (student.hasEnrollment()) return null;
        if (!section.tryEnroll(student)) return null;
        Enrollment enrollment=new Enrollment(student, section);
        student.setEnrollment(enrollment);
        return enrollment;
    }
}
