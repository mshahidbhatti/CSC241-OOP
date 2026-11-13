package shop;

// Book directly extends Product (not ElectronicProduct).
public class Book extends Product {
    private final double discountPercent;

    public Book(String name, double basePrice, double discountPercent) {
        super(name, basePrice, false); // Books are tax-exempt in this example.
        if (discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException("Discount must be 0..100");
        }
        this.discountPercent = discountPercent;
    }

    @Override
    public double calPrice() {
        double discounted = getBasePrice() * (1 - discountPercent / 100);
        return discounted + taxOn(discounted); // taxOn(...) returns zero.
    }
}
