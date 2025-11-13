package revision13;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Element Frequencies: " + map);
    }
}

// Element Frequencies: {1=2, 2=3, 3=1, 4=1}

//Logic:
//Use HashMap to count frequencies.
//Concept: HashMap, frequency map, getOrDefault().