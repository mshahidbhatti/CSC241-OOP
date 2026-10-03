package model;
public class Student {
    private final String id;
    private final String name;
    private Enrollment currentEnrollment;
    public Student(String id, String name) { this.id=id; this.name=name; }
    public String getId() { return id; }
    public String getName() { return name; }
    public Enrollment getEnrollment() { return currentEnrollment; }
    public boolean hasEnrollment() { return currentEnrollment != null; }
    public void setEnrollment(Enrollment enrollment) { currentEnrollment=enrollment; }
}
