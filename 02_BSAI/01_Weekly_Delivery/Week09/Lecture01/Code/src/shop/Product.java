package shop;

import java.time.LocalDate;
import java.util.Locale;

// ABSTRACT CLASS: common data and operations for every product.
public abstract class Product {
    public static final double TAX_RATE = 0.10; // Classroom example: 10% tax
    private static int nextNumber = 1;         // Shared by ALL subclasses

    private final String productId;
    private final String name;
    private final double basePrice;
    private final boolean taxable;
    private final LocalDate createdOn;

    protected Product(String name, double basePrice, boolean taxable) {
        if (name == null || name.trim().isEmpty() || basePrice < 0) {
            throw new IllegalArgumentException("Invalid product details");
        }
        this.name = name;
        this.basePrice = basePrice;
        this.taxable = taxable;
        this.createdOn = LocalDate.now(); // Automatically records creation date

        // The actual object's class is Laptop, Smartphone, Book, etc.
        // Example: Laptop -> LA-001, Smartphone -> SM-002, Book -> BO-003.
        String className = getClass().getSimpleName();
        String prefix = className.substring(0, 2).toUpperCase(Locale.ROOT);
        this.productId = String.format(Locale.US, "%s-%03d", prefix, nextNumber++);
    }

    public final String getProductId() { return productId; }
    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }
    public boolean isTaxable() { return taxable; }
    public LocalDate getCreatedOn() { return createdOn; }

    // Reusable tax rule. For this lesson, tax applies to the discounted
    // selling price of the ITEM only (not to optional warranty/delivery fees).
    protected final double taxOn(double itemSellingPrice) {
        return taxable ? itemSellingPrice * TAX_RATE : 0;
    }

    // ABSTRACT METHOD: each concrete product decides its own final price.
    public abstract double calPrice();

    // FINAL METHOD: subclasses cannot change the standard display format.
    public final void printSummary() {
        System.out.printf(Locale.US, "%-8s %-18s %-12s %-8s %12.2f%n",
                productId, name, createdOn,
                taxable ? "Yes" : "No", calPrice());
    }
}
