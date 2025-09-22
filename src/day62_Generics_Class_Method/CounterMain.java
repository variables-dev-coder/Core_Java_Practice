package day62_Generics_Class_Method;

// Generic Method to Count Elements Greater Than a Given Value

class Counter {
    public static <T extends Comparable<T>> int countGreater(T[] arr, T value) {
        int count = 0;
        for (T element : arr) {
            if (element.compareTo(value) > 0) count++;
        }
        return count;
    }
}

public class CounterMain {
    public static void main(String[] args) {
        Integer[] nums = {1, 5, 7, 2, 10};
        System.out.println(Counter.countGreater(nums, 5)); // 2
    }
}

// Dry Run:
// Compare each with 5 → greater = {7,10} → count=2