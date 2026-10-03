package app;

import model.CreditHours;
import model.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("L07 - complete TODOs 1 to 4, then rerun");
        System.out.println("Before new: " + Student.getTotalStudents());
        Student ali = new Student("CIIT/SP26-BAI-010/LHR", "Ali Ishtiaq");
        System.out.println("After first new: " + Student.getTotalStudents());
        Student abdul = new Student("CIIT/SP26-BAI-003/LHR", "Abdul Rehman Azam");
        System.out.println("After second new: " + Student.getTotalStudents());

        Student alias = ali;
        System.out.println("ali == alias: " + (ali == alias));
        System.out.println("ali == abdul: " + (ali == abdul));
        alias.setName("Ali Ishtiaq (updated)");
        System.out.println("Name read through ali: " + ali.getName());
        System.out.println("After alias assignment: " + Student.getTotalStudents());

        final Student fixedReference = ali;
        fixedReference.setName("Ali Ishtiaq"); // Allowed: the object can change.
        // fixedReference = abdul; // Uncomment separately: reassignment is illegal.
        alias = null;
        System.out.println("After alias = null: " + Student.getTotalStudents());
        System.out.println("Still reachable through ali: " + ali.getName());

        String rawId = "  ciit/sp26-bai-010/lhr  ";
        System.out.println("Normalized: [" + IdTools.normalize(rawId) + "]");
        System.out.println("LHR id: " + IdTools.isLhr(rawId));
        System.out.println("Campus: " + Student.CAMPUS);
        System.out.println("Credits 0 valid: " + CreditHours.validCredits(0));
        System.out.println("Credits 3 valid: " + CreditHours.validCredits(3));
        System.out.println("Credits 7 valid: " + CreditHours.validCredits(7));
    }
}
