
class Tag {
    int code;
    Tag(int code) { this.code = code; }
}

class Box {
    Tag[] tags;
    Box(Tag[] tags) { this.tags = tags; }

    void update() {
        tags[0].code += 5;
        tags[1] = new Tag(40);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Tag first = new Tag(10);
        Tag second = new Tag(20);
        Tag[] items = {first, second};

        Box b = new Box(items);
        b.update();

        System.out.println(first.code + " " + second.code);
        System.out.println(items[0].code + " " + items[1].code);
    }
}
