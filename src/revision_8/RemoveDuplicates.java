package revision_8;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

       // List<Integer> nums = new ArrayList<>(Arrays.asList(10, 10, 20, 20, 30, 30, 40, 50));

        List<Integer> nums = Arrays.asList(10, 10, 20, 20, 30, 30, 40, 50);  // Both same

        Set<Integer> unique = new LinkedHashSet<>(nums);
        System.out.println("Without Duplicates: " + unique);
    }
}

//Without Duplicates: [10, 20, 30, 40, 50]