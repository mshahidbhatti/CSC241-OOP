public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject, int requestPriority) {
        super(name, requestPriority);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher " + getName() + " (" + subject
                + "), request priority=" + getRequestPriority();
    }
}
