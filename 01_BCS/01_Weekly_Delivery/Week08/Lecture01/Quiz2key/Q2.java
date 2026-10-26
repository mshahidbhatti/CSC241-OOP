
class Account {
    int id = 10;
    void print() { System.out.print("A "); }
    void print(int n) { System.out.println("A" + n); }
}

class PremiumAccount extends Account {
    int id = 20;
    @Override void print() { System.out.print("P "); }
    void print(double n) { System.out.println("P" + n); }
}

public class Q2 {
    public static void main(String[] args) {
        Account a = new PremiumAccount();
        System.out.print(a.id + " ");
        a.print();
        a.print(3);
    }
}
