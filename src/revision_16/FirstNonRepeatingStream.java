package revision_16;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeatingStream {

    public static void main(String[] args) {
        String stream = "aabcbdbe";

        Map<Character, Integer> freq = new HashMap<>();
        Queue<Character> q = new LinkedList<>();

        for (char c : stream.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            q.add(c);

            while (!q.isEmpty() && freq.get(q.peek()) > 1)
                q.poll();

            System.out.println("First non-repeating: " +
                    (q.isEmpty() ? "None" : q.peek()));
        }
    }
}

//First non-repeating: a
//First non-repeating: None
//First non-repeating: b
//First non-repeating: b
//First non-repeating: c
//First non-repeating: c
//First non-repeating: c
//First non-repeating: c