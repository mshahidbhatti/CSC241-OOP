
class Machine {
    Machine() { System.out.print("M0 "); }
    Machine(int x) { this(); System.out.print("M" + x + " "); }
}

class Printer extends Machine {
    Printer() { this(2); System.out.println("P0"); }
    Printer(int x) { super(x + 1); System.out.print("P" + x + " "); }
}

public class Q1 {
    public static void main(String[] args) { new Printer(); }
}
