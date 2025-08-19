package day36_Collection_Problem;

import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 5);
        map.put("grapes", 1);

        // Convert to list of entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort by values
        list.sort(Map.Entry.comparingByValue());

        // Maintain order using LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted Map by Values: " + sortedMap);
    }
}

// Sorted Map by Values: {grapes=1, banana=2, apple=3, orange=5}