package day38_Collection_interface;


// Use Collections.unmodifiableList()
//Show how to make a collection read-only.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30));

        List<Integer> unmodifiable = Collections.unmodifiableList(nums);

        System.out.println("Unmodifiable List: " + unmodifiable);

        // unmodifiable.add(40); // This will throw UnsupportedOperationException
    }
}

//Unmodifiable List: [10, 20, 30]