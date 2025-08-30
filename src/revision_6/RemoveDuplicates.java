package revision_6;

/*
Problem 1: Remove all duplicates from a List<Integer> without using Set
Approach:
    Use a new ArrayList (uniqueList) to store only unique elements.
    Iterate through the original list.
    For each element, check if it already exists in uniqueList.
    If not present → add it.
    This removes duplicates while preserving insertion order.

 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 10, 20, 40 , 10, 50, 20));

        List<Integer> uniqueList = new ArrayList<>();
        for (Integer num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        System.out.println("Original List: " + list);
        System.out.println("Unique List : " + uniqueList);
    }
}

//Original List: [10, 20, 30, 10, 20, 40, 10, 50, 20]
//Unique List : [10, 20, 30, 40, 50]


/*
list = [10, 20, 10, 30, 20, 40, 50, 30]
uniqueList = []

Step 1: 10 → uniqueList = [10]
Step 2: 20 → uniqueList = [10, 20]
Step 3: 10 → already exists, skip
Step 4: 30 → uniqueList = [10, 20, 30]
Step 5: 20 → already exists, skip
Step 6: 40 → uniqueList = [10, 20, 30, 40]
Step 7: 50 → uniqueList = [10, 20, 30, 40, 50]
Step 8: 30 → already exists, skip

 */