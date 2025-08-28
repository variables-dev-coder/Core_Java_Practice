package day43_Collection_PriorityQueue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(freqMap.entrySet());

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll().getKey();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(arr, 2))); // [1,2]
    }
}
