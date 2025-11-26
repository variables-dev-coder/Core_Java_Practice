package revision_11;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static int[] removeDuplicate(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int n : arr) {
            set.add(n);
        }

        int[] result = new int[set.size()];
        int i = 0;

        for (int n : set) {
            result[i++] = n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4};
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }
}
