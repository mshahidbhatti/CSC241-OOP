package model;

public class Student {
    public static final String CAMPUS = "LHR";
    private static int totalStudents = 0;

    private final String registrationId;
    private String name;

    public Student(String registrationId, String name) {
        this.registrationId = registrationId;
        this.name = name;
        // TODO L07-1: increment the shared counter once per constructed object.
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
