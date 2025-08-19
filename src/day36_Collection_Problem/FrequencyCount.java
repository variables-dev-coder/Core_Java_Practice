package day36_Collection_Problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String fruit : list) {
            frequencyMap.put(fruit, frequencyMap.getOrDefault(fruit, 0) + 1);
        }

        System.out.println("Frequency of elements: " + frequencyMap);
    }
}

// Frequency of elements: {banana=2, orange=1, apple=3}