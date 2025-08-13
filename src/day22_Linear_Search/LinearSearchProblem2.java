package day22_Linear_Search;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchProblem2 {
    public static List<Integer> findAllOccurrences(int[] arr, int target) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 20, 40, 50, 20, 60};
        int target = 20;

        List<Integer> occurrences = findAllOccurrences(nums, target);

        if (!occurrences.isEmpty()) {
            System.out.println("Element found at index: " + occurrences);
        } else {
            System.out.println("Element not found");
        }
    }
}
