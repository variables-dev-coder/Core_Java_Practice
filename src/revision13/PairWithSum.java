package revision13;


//Find Pair with Given Sum in Array
//Input: [8, 7, 2, 5, 3, 1], sum = 10
//Output: (8,2) or (7,3)

import java.util.HashSet;
import java.util.Set;

public class PairWithSum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            int diff = target - num;
            if (set.contains(diff)) {
                System.out.println("Pair: (" + num + ", " + diff + ")");
            }
            set.add(num);
        }
    }
}

// Pair: (2, 8)
// Pair: (3, 7)

//Logic:
//Check if complement exists in set while iterating.
//Concept: HashSet lookup (O(1)).