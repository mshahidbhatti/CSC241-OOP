// ONE generic processor handles many kinds of comparable objects.
// T must support compareTo(T).
public class TaskProcessor<T extends Comparable<T>> {

    // Positive: first has higher priority.
    // Negative: second has higher priority.
    // Zero: both have equal priority.
    public int myCompare(T first, T second) {
        return first.compareTo(second);
    }

    // Process the higher-priority object first.
    public T processTask(T first, T second) {
        int result = myCompare(first, second);
        T selected;

        if (result > 0) {
            selected = first;
            System.out.println("First item has higher priority.");
        } else if (result < 0) {
            selected = second;
            System.out.println("Second item has higher priority.");
        } else {
            selected = first;  // Tie: choose the first item.
            System.out.println("Equal priority; choosing the first item.");
        }

        System.out.println("Process first: " + selected);
        return selected;
    }
}
