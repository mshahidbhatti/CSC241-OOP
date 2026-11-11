package app;

import shop.*;
import java.util.Locale;

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
