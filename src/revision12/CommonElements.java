package revision12;

import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) set.add(num);

        System.out.print("Common elements: ");
        for (int num : arr2) {
            if (set.contains(num)) System.out.print(num + " ");
        }
    }
}


// Common elements: 4 5