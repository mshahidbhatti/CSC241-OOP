public class Car extends Vehicle {
    public Car(String brand, int servicePriority) {
        super(brand, servicePriority);
    }

    @Override
    public String toString() {
        return "Car " + getBrand() + ", service priority=" + getServicePriority();
    }
}
