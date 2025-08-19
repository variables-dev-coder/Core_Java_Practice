package day36_Collection_Problem;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 10, 40, 30);

        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

        System.out.println("Without duplicates: " + uniqueNumbers);
    }
}

// Without duplicates: [10, 20, 30, 40]