package day21_Insertion_Sort;

import java.util.LinkedHashSet;
import java.util.Set;

public class InsertionSortUnique {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 5, 2, 4};

        // Remove duplicate
        Set<Integer> set = new LinkedHashSet<>();
        for (int val : arr) {
            set.add(val);
        }

        // Converted to array
        int[] uniqueArr = new int[set.size()];
        int index = 0;
        for (int val : set) {
            uniqueArr[index++] = val;
        }

        // Insert sort
        for (int i = 1; i < uniqueArr.length; i++) {
            int key = uniqueArr[i];
            int j = i - 1;
            while (j >= 0 && uniqueArr[j] > key) {
                uniqueArr[j + 1] = uniqueArr[j];
                j--;
            }
            uniqueArr[j + 1] = key;
        }

        for (int val : uniqueArr) {
            System.out.print(val + " ");
        }
    }
}
