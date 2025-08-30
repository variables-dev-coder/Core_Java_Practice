package revision_6;

//Problem 2: Merge two ArrayLists & remove duplicates while maintaining order
//Given two lists, merge them and remove duplicates but keep the first occurrence order.


import java.util.*;

public class MergeArrayList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

        List<Integer> merged = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : list1) {
            if (!seen.contains(num)) {
                merged.add(num);
                seen.add(num);
            }
        }

        for (int num : list2) {
            if (!seen.contains(num)) {
                merged.add(num);
                seen.add(num);
            }
        }

        System.out.println("Merged List without duplicates: " + merged);
    }
}

/*
Dry Run

Input:
list1 = [1, 2, 3, 4]
list2 = [3, 4, 5, 6]

Step 1: Add from list1

seen = {1,2,3,4}, merged = [1,2,3,4]

Step 2: Add from list2

3 already seen → skip

4 already seen → skip

5 not seen → add → merged = [1,2,3,4,5], seen = {1,2,3,4,5}

6 not seen → add → merged = [1,2,3,4,5,6]

Output → Merged List without duplicates: [1, 2, 3, 4, 5, 6]


 */