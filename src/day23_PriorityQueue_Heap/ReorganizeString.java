package day23_PriorityQueue_Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {


    public static String reorganizeString(String s) {
        // Step 1: Count frequency
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray())
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

        // Step 2: Max-Heap on frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(freq.entrySet());

        StringBuilder result = new StringBuilder();

        while (maxHeap.size() > 1) {
            // Step 3: Take top 2
            Map.Entry<Character, Integer> first = maxHeap.poll();
            Map.Entry<Character, Integer> second = maxHeap.poll();

            result.append(first.getKey());
            result.append(second.getKey());

            // Step 4: Decrease freq and push back if > 0
            if (first.getValue() - 1 > 0)
                maxHeap.offer(Map.entry(first.getKey(), first.getValue() - 1));
            if (second.getValue() - 1 > 0)
                maxHeap.offer(Map.entry(second.getKey(), second.getValue() - 1));
        }

        // Step 5: Check leftover
        if (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> last = maxHeap.poll();
            if (last.getValue() > 1)
                return ""; // Not possible
            result.append(last.getKey());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aab";
        System.out.println(reorganizeString(s)); // Output: "aba"

        String s2 = "aaab";
        System.out.println(reorganizeString(s2)); // Output: ""
    }
}
