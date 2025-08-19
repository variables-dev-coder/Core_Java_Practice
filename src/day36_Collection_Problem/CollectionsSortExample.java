package day36_Collection_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSortExample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));

        System.out.println("Original List: " + nums);

        // Ascending
        Collections.sort(nums);
        System.out.println("Ascending: " + nums);

        // Descending
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("Descending: " + nums);
    }
}

/*
Original List: [5, 2, 8, 1, 3]
Ascending: [1, 2, 3, 5, 8]
Descending: [8, 5, 3, 2, 1]
 */