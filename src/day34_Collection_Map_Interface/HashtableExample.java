package day34_Collection_Map_Interface;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        // Adding elements
        ht.put(1, "Munna");
        ht.put(2, "Java");
        ht.put(3, "Spring Boot");
        ht.put(4, "Microservices");

        // Display the map
        System.out.println("🔍 Hashtable elements:");
        for (Integer key : ht.keySet()) {
            System.out.println(key + " → " + ht.get(key));
        }

        // Get value by key
        System.out.println("\nGet key 2: " + ht.get(2));

        // Contains Key or Value
        System.out.println("Contains key 3? " + ht.containsKey(3));
        System.out.println("Contains value 'Java'? " + ht.containsValue("Java"));

        // Remove key
        ht.remove(1);
        System.out.println("\nAfter removing key 1: " + ht);
    }
}
