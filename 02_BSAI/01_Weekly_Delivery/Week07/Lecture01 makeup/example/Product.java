public class Product {
    private static int nextId = 1;
    private static final String ID_SUFFIX = "-PRD";

    private final String id;
    private String name;
    private double price;
    private Date manufacturingDate;



    public Product(String name, double price, Date manufacturingDate) {
        this.id = nextId + ID_SUFFIX;
        nextId++;

        this.name = name;
        this.price = price;
        this.manufacturingDate = new Date(1,1,1);
    }

    public String getId() {
        return id;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Product: " + name);
        System.out.println("Price: Rs. " + price);

        System.out.print("Manufacturing date: ");
        manufacturingDate.displayDate();
    }
}