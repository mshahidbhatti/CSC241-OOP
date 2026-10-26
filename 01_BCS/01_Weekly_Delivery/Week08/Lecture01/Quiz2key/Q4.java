
public class Q4 {
    public static void main(String[] args) {
        String a = "Java";
        String b = a;

        a.concat("Lab");
        a = a + "OOP";

        Integer x = 5;
        Integer y = x;
        x = x + 2;

        System.out.println(b + " " + a);
        System.out.println(y + " " + x);
        System.out.println(a == b);
    }
}
