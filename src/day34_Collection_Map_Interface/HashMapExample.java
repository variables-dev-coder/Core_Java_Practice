package day34_Collection_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Add elements
        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "Spring Boot");
        map.put(4, "Microservices");
        map.put(5, "MySql");

        // Update value
        map.put(1, "Core Java");   // Overwrites previous values

        // Print all key-values pairs
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Get value
        System.out.println("Value at key 1: " + map.get(1));

        // Remove value
        map.remove(3);

        // Contains check
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Microservices'? " + map.containsValue("Microservices"));

        // Size
        System.out.println("Map size: " + map.size());

        // Null key and value
        map.put(null, "NullKeyValue");
        map.put(6, null);
        System.out.println("After adding null key and null value: " + map);
    }
}
