package day34_Collection_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("Apple", 250);
        map.put("Banana", 70);
        map.put("Cherry", 300);
        map.put("Pear", 270);

        // Update
        map.put("Apple", 230);   // Overwrites old value

        // Fetch
        System.out.println("Apple Count: " + map.get("Apple"));

        // Looping over keys
        for (String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }

        // Contains
        System.out.println(map.containsKey("Banana"));
        System.out.println(map.containsValue(70));

        // Remove
        map.remove("Banana");
        System.out.println("Final map: " + map);
    }
}
