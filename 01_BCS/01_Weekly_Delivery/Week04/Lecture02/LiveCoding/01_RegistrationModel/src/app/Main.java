package app;
import model.Student;
import model.Course;
import model.CourseSection;
import model.Enrollment;
public class Main {
    public static void main(String[] args) {
        // DEMO identifiers are illustrative, not roster registrations.
        Student s1=new Student("DEMO-01", "Student A");
        Student s2=new Student("DEMO-02", "Student B");
        Student s3=new Student("DEMO-03", "Student C");
        Course course=new Course("CSC241", "Object Oriented Programming");
        CourseSection section=new CourseSection(course, "A");
        Registration registration=new Registration();
        registration.register(s1, section);
        snapshot("BEFORE Student B request", section, s2);
        Enrollment result=registration.register(s2, section);
        System.out.println("Request result: "+(result == null ? "NO ENROLLMENT" : result.getStatus()));
        snapshot("AFTER Student B request", section, s2);
        System.out.println("Repeat rejected: "+(registration.register(s2, section) == null));
        snapshot("AFTER repeat request", section, s2);
        System.out.println("Full section rejected: "+(registration.register(s3, section) == null));
        snapshot("AFTER Student C request", section, s3);
        // Duplicate-ID check while one seat is still free.
        CourseSection separate=new CourseSection(course, "B");
        separate.tryEnroll(s1);
        Student sameId=new Student("DEMO-01", "Same ID, another object");
        System.out.println("Duplicate ID with free seat rejected: "+!separate.tryEnroll(sameId));
        System.out.println("Separate section count: "+separate.getEnrolledCount());
    }
    private static String id(Student student) { return student == null ? "null" : student.getId(); }
    private static void snapshot(String label, CourseSection section, Student student) {
        System.out.println(); System.out.println(label);
        System.out.println("Capacity: "+section.getCapacity());
        System.out.println("firstStudent: "+id(section.getFirstStudent()));
        System.out.println("secondStudent: "+id(section.getSecondStudent()));
        System.out.println("Enrolled: "+section.getEnrolledCount());
        System.out.println("Has seat: "+section.hasSeat());
        System.out.println(student.getName()+" currentEnrollment: "+
            (student.getEnrollment() == null ? "null" : student.getEnrollment().getStatus()));
    }
}
