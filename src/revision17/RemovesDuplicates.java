package revision17;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemovesDuplicates {

    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 1, 2, 1, 3, 5};

        List<Integer> result = removeDuplicates(arr);

        System.out.println(result);
    }

    public static List<Integer> removeDuplicates(int[] arr) {
        // LinkedHashSet maintains insertion order
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);  // duplicate values are automatically ignored
        }

        // convert set to list and return
        return new ArrayList<>(set);
    }
}
