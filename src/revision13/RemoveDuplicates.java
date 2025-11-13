package revision13;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr)
            set.add(num);

        System.out.println("After removing duplicate: " + set); // After removing duplicate: [1, 2, 3, 4, 5]
    }
}

//Logic:
//Use LinkedHashSet to maintain order & uniqueness.
//Automatically ignores repeated values.
//Concept: Set Interface, LinkedHashSet, uniqueness property.