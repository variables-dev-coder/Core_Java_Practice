package revision_7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 10, 20, 30, 40, 20, 50, 10};

        // Use HashSet to store unique element only

        //Set<Integer> uniqueSet = new HashSet<>();  // Does not maintain order

        Set<Integer> uniqueSet = new TreeSet<>();  // Keep sorted order → Use TreeSet

        for (int num : nums) {
            uniqueSet.add(num);
        }
        System.out.println("Unique Element: " + uniqueSet);
    }
}

//[50, 20, 40, 10, 30]   Use HashSet, Does not maintain order

//[10, 20, 30, 40, 50]

