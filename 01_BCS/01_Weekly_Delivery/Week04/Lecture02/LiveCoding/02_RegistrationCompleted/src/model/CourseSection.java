package model;
// Bounded classroom example: exactly two seats, with named references.
public class CourseSection {
    private final Course course;
    private final String sectionName;
    private final int capacity=2;
    private Student firstStudent;
    private Student secondStudent;
    public CourseSection(Course course, String sectionName) {
        this.course=course; this.sectionName=sectionName;
    }
    public Course getCourse() { return course; }
    public String getSectionName() { return sectionName; }
    public int getCapacity() { return capacity; }
    public Student getFirstStudent() { return firstStudent; }
    public Student getSecondStudent() { return secondStudent; }
    public int getEnrolledCount() {
        int count=0;
        if (firstStudent != null) count++;
        if (secondStudent != null) count++;
        return count;
    }
    public boolean hasSeat() {
        return firstStudent == null || secondStudent == null;
    }
    public boolean containsStudent(Student student) {
        if (firstStudent != null && firstStudent.getId().equals(student.getId())) return true;
        if (secondStudent != null && secondStudent.getId().equals(student.getId())) return true;
        return false;
    }
    public boolean tryEnroll(Student student) {
        if (containsStudent(student) || !hasSeat()) return false;
        if (firstStudent == null) firstStudent=student;
        else secondStudent=student;
        return true;
    }
}
