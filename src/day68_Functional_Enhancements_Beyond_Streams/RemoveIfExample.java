package day68_Functional_Enhancements_Beyond_Streams;

// removeIf()

import java.util.ArrayList;
import java.util.List;

public class RemoveIfExample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        nums.removeIf(n -> n % 2 == 0);
        System.out.println(nums); // [1, 3, 5, 7, 9]
    }
}
