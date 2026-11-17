// Second hierarchy: a workshop chooses which vehicle to service first.
// Bigger servicePriority means a more urgent repair.
public class Vehicle implements Comparable<Vehicle> {
    private String brand;
    private int servicePriority;

    public Vehicle(String brand, int servicePriority) {
        this.brand = brand;
        this.servicePriority = servicePriority;
    }

    public String getBrand() {
        return brand;
    }

    public int getServicePriority() {
        return servicePriority;
    }

    @Override
    public int compareTo(Vehicle other) {
        return Integer.compare(this.servicePriority, other.servicePriority);
    }
}
