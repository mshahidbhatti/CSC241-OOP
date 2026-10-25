
class Label {
    static int objects = 0;
    String text;

    Label(String text) {
        this.text = text;
        objects++;
    }

    void preview(String suffix) {
        text.concat(suffix);
    }

    void update(String suffix) {
        text = text + suffix;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Label a = new Label("CS"), b = a;

        a.preview("AI");
        b.update("241");

        Label c = new Label("OOP");

        System.out.println(a.text + " " + b.text);
        System.out.println(c.text + " " + Label.objects);
        System.out.println(a == b);
    }
}
