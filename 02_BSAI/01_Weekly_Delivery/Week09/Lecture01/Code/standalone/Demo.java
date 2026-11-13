// CSC241 Week 9: abstract methods, final, LocalDate, tax, multilevel inheritance, polymorphism.
// Save as Demo.java; compile with: javac Demo.java ; run with: java Demo

import java.time.LocalDate;
import java.util.Locale;

// ABSTRACT CLASS: common data and operations for every product.
abstract class Product {
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

// ABSTRACT INTERMEDIATE CLASS: Product -> ElectronicProduct -> Laptop/Smartphone.
abstract class ElectronicProduct extends Product {
    private final double warrantyFee;
    private final int warrantyMonths;

    protected ElectronicProduct(String name, double basePrice,
                                double warrantyFee, int warrantyMonths) {
        super(name, basePrice, true); // All electronics taxable in this example.
        if (warrantyFee < 0 || warrantyMonths < 0) {
            throw new IllegalArgumentException("Invalid warranty details");
        }
        this.warrantyFee = warrantyFee;
        this.warrantyMonths = warrantyMonths;
    }

    public double getWarrantyFee() { return warrantyFee; }

    public LocalDate getWarrantyEndDate() {
        return getCreatedOn().plusMonths(warrantyMonths);
    }

    // calPrice() remains abstract; concrete subclasses implement it.
}

// Laptop is a concrete subclass at the third level of the hierarchy.
class Laptop extends ElectronicProduct {
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

// FINAL CLASS: no class can inherit from Smartphone.
final class Smartphone extends ElectronicProduct {
    private final double deliveryFee;

    public Smartphone(String name, double basePrice, double warrantyFee,
                      int warrantyMonths, double deliveryFee) {
        super(name, basePrice, warrantyFee, warrantyMonths);
        if (deliveryFee < 0) {
            throw new IllegalArgumentException("Invalid delivery fee");
        }
        this.deliveryFee = deliveryFee;
    }

    @Override
    public double calPrice() {
        double itemPrice = getBasePrice();
        return itemPrice + taxOn(itemPrice) + getWarrantyFee() + deliveryFee;
    }
}

// Book directly extends Product (not ElectronicProduct).
class Book extends Product {
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

public class Demo {
    public static void main(String[] args) {
        // POLYMORPHISM: superclass references hold different subclass objects.
        Product[] products = {
            new Laptop("Gaming Laptop", 100000, 10, 3000, 12),
            new Smartphone("Smartphone", 60000, 2000, 24, 500),
            new Book("Java Book", 3000, 20)
        };

        System.out.println("PRODUCT PRICE LIST");
        System.out.println("Classroom tax policy: electronics taxable at 10%, books exempt");
        System.out.printf("%-8s %-18s %-12s %-8s %12s%n",
                "ID", "Product", "Created", "Taxable", "Price (Rs.)");
        System.out.println("-----------------------------------------------------------------");

        double total = 0;
        for (Product p : products) {
            // printSummary() is final; it invokes polymorphic calPrice().
            p.printSummary();
            total += p.calPrice();
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.printf(Locale.US, "Total: Rs. %.2f%n", total);

        // LocalDate demo: creation date is automatic; warranty expiry is derived.
        Laptop laptop = (Laptop) products[0]; // Safe cast; discuss later if needed.
        System.out.println("Laptop warranty ends: " + laptop.getWarrantyEndDate());

        // Uncomment each line separately to discuss a compilation error:
        // Product p = new Product("General", 100, true); // abstract class
        // class ExtraPhone extends Smartphone {}          // final class
        // class BasicItem extends Product {}              // calPrice missing
    }
}
