package day25_Binary_Heap_Implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
    public static String reorganize(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);

        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
                (a, b) -> freq.get(b) - freq.get(a)
        );
        maxHeap.addAll(freq.keySet());

        StringBuilder result = new StringBuilder();
        while (maxHeap.size() >= 2) {
            char first = maxHeap.poll();
            char second = maxHeap.poll();

            result.append(first).append(second);
            freq.put(first, freq.get(first) - 1);
            freq.put(second, freq.get(second) - 1);

            if (freq.get(first) > 0) maxHeap.offer(first);
            if (freq.get(second) > 0) maxHeap.offer(second);
        }

        if (!maxHeap.isEmpty()) {
            char last = maxHeap.poll();
            if (freq.get(last) > 1) return "";
            result.append(last);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aab";
        System.out.println(reorganize(s)); // Possible: "aba"
    }
}
