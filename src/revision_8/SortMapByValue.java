package revision_8;

import java.util.*;


public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Alice", 85);
        marks.put("Bob", 95);
        marks.put("Charlie", 75);

        // Sort by values
        List<Map.Entry<String, Integer>> sorted =
                marks.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .toList();

        System.out.println("Sorted by marks: " + sorted);
    }
}

//Sorted by marks: [Charlie=75, Alice=85, Bob=95]