package model;
public class Loan {
    private final Member member;
    private final BookCopy copy;
    private final String startedOn;
    private final String dueOn;
    private final String status="ACTIVE";
    public Loan(Member member, BookCopy copy, String startedOn, String dueOn) {
        this.member=member; this.copy=copy; this.startedOn=startedOn; this.dueOn=dueOn;
    }
    public Member getMember() { return member; }
    public BookCopy getCopy() { return copy; }
    public String getStartedOn() { return startedOn; }
    public String getDueOn() { return dueOn; }
    public String getStatus() { return status; }
}
