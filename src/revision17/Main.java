package revision17;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 5, 3, 3};
        Map<Integer, Integer> freqMap = getFrequency(arr);

        System.out.println(freqMap);
    }

    public static Map<Integer, Integer> getFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map;
    }
}

// {2=2, 3=3, 4=1, 5=1}