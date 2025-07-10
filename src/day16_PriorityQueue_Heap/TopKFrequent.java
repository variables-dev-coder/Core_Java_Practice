package day16_PriorityQueue_Heap;

import java.util.*;

public class TopKFrequent {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums)
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

        // Min-Heap of (frequency, number)
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) pq.poll(); // remove lowest freq
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : pq)
            result.add(entry.getKey());

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(topKFrequent(nums, 2)); // [1, 2]
    }
}
