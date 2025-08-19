package day36_Collection_Problem;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Munna");
        map.put(2, "Rahul");
        map.put(3, "Anita");
        map.put(2, "Rohit"); // overwrite value for key=2

        System.out.println("HashMap: " + map);

        // Access
        System.out.println("Key 1 -> " + map.get(1));

        // Iteration
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

/*
HashMap: {1=Munna, 2=Rohit, 3=Anita}
Key 1 -> Munna
1 => Munna
2 => Rohit
3 => Anita
 */