package revision_7;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 6, 7, 5};

        // Store element arr1 in a HashSet
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        // find intersection of arr1 in a HashSet
        Set<Integer> intersection  = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        System.out.println("Intersection : " + intersection);
    }
}


//Intersection : [3, 4, 5]