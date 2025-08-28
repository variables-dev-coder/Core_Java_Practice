package day43_Collection_PriorityQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
    public static String reorganizeString(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq =
                new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        pq.addAll(freq.entrySet());

        StringBuilder sb = new StringBuilder();
        Map.Entry<Character, Integer> prev = null;

        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> curr = pq.poll();
            sb.append(curr.getKey());
            curr.setValue(curr.getValue() - 1);

            if (prev != null && prev.getValue() > 0) {
                pq.add(prev);
            }
            prev = curr;
        }

        return sb.length() == s.length() ? sb.toString() : "";
    }

    public static void main(String[] args) {
        System.out.println(reorganizeString("aab")); // "aba"
        System.out.println(reorganizeString("aaab")); // ""
    }
}
