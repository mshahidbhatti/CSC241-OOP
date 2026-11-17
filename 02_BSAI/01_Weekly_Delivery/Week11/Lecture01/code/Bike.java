public class Bike extends Vehicle {
    public Bike(String brand, int servicePriority) {
        super(brand, servicePriority);
    }

    @Override
    public String toString() {
        return "Bike " + getBrand() + ", service priority=" + getServicePriority();
    }
}
