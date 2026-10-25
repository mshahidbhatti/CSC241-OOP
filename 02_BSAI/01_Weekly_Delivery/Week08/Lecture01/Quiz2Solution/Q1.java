
class Engine {
    int power;

    Engine(int p) {
        power = p;
        System.out.print("E" + p + " ");
    }
}

class Scooter {
    Engine engine;

    Scooter() {
        this(4);
        System.out.print("D ");
    }

    Scooter(int n) {
        engine = new Engine(n + 1);
    }

    void show() {
        System.out.println(engine.power);
        System.out.print("S" + engine.power + " ");
    }
}

public class Q1 {
    public static void main(String[] args) {
        new Scooter().show();
    }
}
