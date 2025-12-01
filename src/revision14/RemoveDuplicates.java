package revision14;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,4,5};
        Set<Integer> set = new HashSet<>();

        for (int x : arr) set.add(x);

        System.out.println(set);  // [1, 2, 3, 4, 5]
    }
}
