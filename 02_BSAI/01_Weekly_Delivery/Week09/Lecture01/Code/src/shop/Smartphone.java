package shop;

// FINAL CLASS: no class can inherit from Smartphone.
public final class Smartphone extends ElectronicProduct {
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
