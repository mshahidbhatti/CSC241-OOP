package model;
public class Enrollment {
    private final Student student;
    private final CourseSection section;
    private final String status="ACTIVE";
    public Enrollment(Student student, CourseSection section) {
        this.student=student; this.section=section;
    }
    public Student getStudent() { return student; }
    public CourseSection getSection() { return section; }
    public String getStatus() { return status; }
}
