package revision_7;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 3, 5, 2, 1, 3};

        // HashSet stores unique element only
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : arr) {
            uniqueSet.add(num);
        }
        System.out.println("Unique elements : " + uniqueSet);
    }
}
