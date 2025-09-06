package revision_8;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 5, 1};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates: " + duplicates);
    }
}

//Duplicates: [1, 2]
