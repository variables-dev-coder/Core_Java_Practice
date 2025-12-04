package revision_16;

import java.util.*;

public class KFrequentWords {
    
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (String w : words)
            map.put(w, map.getOrDefault(w, 0) + 1);

        PriorityQueue<String> pq = new PriorityQueue<>(
                (a, b) -> map.get(a).equals(map.get(b)) ?
                        b.compareTo(a) : map.get(a) - map.get(b)
        );

        for (String w : map.keySet()) {
            pq.add(w);
            if (pq.size() > k)
                pq.poll();
        }

        List<String> result = new ArrayList<>();
        while (!pq.isEmpty())
            result.add(pq.poll());

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"java", "code", "java", "ds", "code", "java"};
        System.out.println(topKFrequent(words, 2));
    }
}

//[java, code]