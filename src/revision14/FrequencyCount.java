package revision14;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 1};
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(map);   // {1=3, 2=2, 3=1}
    }
}
