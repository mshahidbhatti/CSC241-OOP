public class Student extends Person {
    private String rollNo;

    public Student(String name, String rollNo, int requestPriority) {
        super(name, requestPriority);
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student " + getName() + " (" + rollNo
                + "), request priority=" + getRequestPriority();
    }
}
