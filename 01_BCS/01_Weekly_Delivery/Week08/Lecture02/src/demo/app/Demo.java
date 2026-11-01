package demo.app;

import demo.enrollment.Enrollment;

public class Demo {
    private static Enrollment activeEnrollment;

    private Demo() {
    }

    public static void main(String[] args) {
        activeEnrollment = new Enrollment("Amina Khan", "SP26-BCS-001");
        activeEnrollment.printRecord();
    }
}
