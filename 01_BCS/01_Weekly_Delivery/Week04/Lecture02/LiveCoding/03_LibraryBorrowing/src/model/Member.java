package model;
public class Member {
    private final String id;
    private Loan currentLoan;
    public Member(String id) { this.id=id; }
    public String getId() { return id; }
    public Loan getLoan() { return currentLoan; }
    public boolean hasLoan() { return currentLoan != null; }
    public void setLoan(Loan loan) { currentLoan=loan; }
}
