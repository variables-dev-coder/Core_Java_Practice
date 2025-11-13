package revision13;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        Set<Integer> setA = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int n : a) setA.add(n);
        for (int n : b) {
            if (setA.contains(n))
                intersection.add(n);
        }

        System.out.println("Intersection: " + intersection);  // Intersection: [3, 4]
    }
}


// Concept: HashSet, lookup efficiency (O(1)), intersection logic.