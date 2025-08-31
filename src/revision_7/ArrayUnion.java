package revision_7;

import java.util.HashSet;
import java.util.Set;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        // Use Set to store unique elements
        Set<Integer> union = new HashSet<>();

        // Add all elements of arr1
        for (int num : arr1) {
            union.add(num);
        }

        // Add all elements of arr2
        for (int num : arr2) {
            union.add(num);
        }

        System.out.println("Union : " + union);
    }
}

// Union : [1, 2, 3, 4, 5, 6, 7, 8]