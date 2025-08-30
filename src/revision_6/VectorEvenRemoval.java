package revision_6;

// Store 10 random integers in a Vector, then remove all even numbers.

import java.util.Random;
import java.util.Vector;

public class VectorEvenRemoval {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        Random rand = new Random();

        // Store 10 random integers
        for (int i = 0; i < 10; i++) {
            vec.add(rand.nextInt(100)); // random 0–99
        }

        System.out.println("Original Vector: " + vec);

        // Remove even numbers
        vec.removeIf(n -> n % 2 == 0);

        System.out.println("After Removing Even Numbers: " + vec);
    }
}

//Dry Run (Example)

/*
Original Vector: [23, 44, 15, 62, 37, 89, 10, 55, 76, 91]
Remove evens → removes 44, 62, 10, 76
Result: [23, 15, 37, 89, 55, 91]

 */