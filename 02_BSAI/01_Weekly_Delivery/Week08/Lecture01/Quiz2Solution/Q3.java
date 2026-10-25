
class Tag {
    int value;

    Tag(int n) {
        value = n;
    }
}

class Rack {
    Tag[] tags;

    Rack(Tag[] t) {
        tags = t;
    }

    void adjust() {
        tags[0].value += 5;
        tags = new Tag[] {new Tag(99), tags[1]};
    }

    int first() {
        return tags[0].value;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Tag a = new Tag(10), b = new Tag(20);
        Tag[] items = {a, b};

        Rack rack = new Rack(items);
        rack.adjust();

        System.out.println(a.value + " " + items[0].value);
        System.out.println(rack.first() + " " + items[1].value);
    }
}
