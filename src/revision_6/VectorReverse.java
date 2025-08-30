package revision_6;

//Implement a method to reverse elements of a Vector in-place.

import java.util.Arrays;
import java.util.Vector;

public class VectorReverse {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("Original Vector: " + vec);

        // Reverse in-place
        for (int i = 0, j = vec.size() - 1; i < j; i++, j--) {
            int temp = vec.get(i);
            vec.set(i, vec.get(j));
            vec.set(j, temp);
        }

        System.out.println("Reversed Vector: " + vec);
    }
}

/*

Dry Run

Original Vector: [10, 20, 30, 40, 50]
Swap (10, 50) → [50, 20, 30, 40, 10]
Swap (20, 40) → [50, 40, 30, 20, 10]
Done
Final → [50, 40, 30, 20, 10]


 */