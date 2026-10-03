package app;
import model.Member;
import model.Book;
import model.BookCopy;
import model.Loan;
public class Main {
    public static void main(String[] args) {
        Member member=new Member("M-DEMO-01");
        Book book=new Book("Java Basics");
        BookCopy copy=new BookCopy("COPY-01", book);
        LibraryDesk desk=new LibraryDesk();
        System.out.println("Before available: "+copy.isAvailable());
        System.out.println("Before currentLoan null: "+(member.getLoan() == null));
        Loan loan=desk.borrow(member, copy, "2026-10-03", "2026-10-10");
        System.out.println("Result: "+(loan == null ? "NO LOAN" : loan.getStatus()));
        System.out.println("After available: "+copy.isAvailable());
        System.out.println("After currentLoan null: "+(member.getLoan() == null));
        Member other=new Member("M-DEMO-02");
        System.out.println("Second member rejected: "+
            (desk.borrow(other, copy, "2026-10-03", "2026-10-10") == null));
        System.out.println("Other member still has no loan: "+!other.hasLoan());
    }
}
