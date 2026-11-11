package shop;

import java.time.LocalDate;

// ABSTRACT INTERMEDIATE CLASS: Product -> ElectronicProduct -> Laptop/Smartphone.
public abstract class ElectronicProduct extends Product {
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
