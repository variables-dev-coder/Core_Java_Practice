package day38_Collection_interface;

// Using Collections.sort()

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 3, 45, 7));
        Collections.sort(numbers);  // Utility method from Collections
        System.out.println("Sorted List: " + numbers);
    }
}

// Sorted List: [3, 7, 10, 45]