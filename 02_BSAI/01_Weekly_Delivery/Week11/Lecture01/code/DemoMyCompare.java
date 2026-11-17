public class DemoMyCompare {
    public static void main(String[] args) {
        // EXAMPLE 1: SAME generic class, used for Person objects.
        // Student and Teacher are both Person objects.
        Student student = new Student("Ayesha", "BAI-001", 4);
        Teacher teacher = new Teacher("Dr. Atif", "OOP", 7);

        TaskProcessor<Person> universityProcessor = new TaskProcessor<>();
        System.out.println("=== University request processing ===");
        System.out.println("myCompare result: "
                + universityProcessor.myCompare(student, teacher));
        Person firstRequest = universityProcessor.processTask(student, teacher);

        System.out.println();

        // EXAMPLE 2: EXACT SAME TaskProcessor, now used for vehicles.
        Car car = new Car("Toyota", 9);
        Bike bike = new Bike("Honda", 3);

        TaskProcessor<Vehicle> workshopProcessor = new TaskProcessor<>();
        System.out.println("=== Vehicle service processing ===");
        System.out.println("myCompare result: "
                + workshopProcessor.myCompare(car, bike));
        Vehicle firstVehicle = workshopProcessor.processTask(car, bike);

        // Uncomment to test an equal-priority case.
        // workshopProcessor.processTask(new Car("Suzuki", 5), new Bike("Yamaha", 5));

        // Uncomment to demonstrate COMPILE-TIME type safety:
        // universityProcessor.processTask(student, car); // ERROR: Car is not Person
        // TaskProcessor<String> words = new TaskProcessor<>(); // Valid: String is Comparable<String>
    }
}
