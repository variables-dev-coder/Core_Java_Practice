package revision_7;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeated {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        Set<Integer> seen = new HashSet<>();
        int firstRepeated = -1;

        for (int num : arr) {
            if (seen.contains(num)) {
                firstRepeated = num;
                break;
            } else {
                seen.add(num);
            }
        }

        if (firstRepeated != -1) {
            System.out.println("First Repeated Element: " + firstRepeated);
        } else {
            System.out.println("No Repeated Element Found");
        }
    }
}
