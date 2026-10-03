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
        // TODO 1: return true if either named seat is empty.
        return false;
    }
    public boolean containsStudent(Student student) {
        // TODO 2: compare non-null seat occupants with the requested student ID.
        // String.equals compares ID text; == would compare String references.
        return false;
    }
    public boolean tryEnroll(Student student) {
        // TODO 3: reject duplicate/full; otherwise fill the first empty seat.
        return false;
    }
}
