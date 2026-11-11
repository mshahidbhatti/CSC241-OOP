package shop;

// Laptop is a concrete subclass at the third level of the hierarchy.
public class Laptop extends ElectronicProduct {
    private final double discountPercent;

    public Laptop(String name, double basePrice, double discountPercent,
                  double warrantyFee, int warrantyMonths) {
        super(name, basePrice, warrantyFee, warrantyMonths);
        if (discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException("Discount must be 0..100");
        }
        this.discountPercent = discountPercent;
    }

    @Override
    public double calPrice() {
        double discounted = getBasePrice() * (1 - discountPercent / 100);
        // Tax is charged on the discounted item price, before warranty fee.
        return discounted + taxOn(discounted) + getWarrantyFee();
    }
}
