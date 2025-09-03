package day48_Collection_Map_Interface;

public class Notes {
    public static void main(String[] args) {
        /*

1. What is Map in Java?
    A Map is a collection that stores data in key-value pairs.
    Keys are unique, but values can be duplicate.
    Example: A dictionary → word (key) and meaning (value).

Unlike List/Set, Map does not extend Collection interface. It is a separate hierarchy.


2. Features of Map
    1.Stores elements as key → value pairs.
    2.Each key maps to at most one value.
    3.Keys must be unique.
    4.Values can be duplicate.
    5.Allows fast searching, insertion, and deletion using the key.


3. Important Map Implementations
    1. HashMap
        Stores key-value pairs in a hash table.
        Order is not guaranteed.
        Allows null key (only 1) and multiple null values.
        Not synchronized (faster, but not thread-safe).

    2. LinkedHashMap
        Same as HashMap, but maintains insertion order.

    3. TreeMap
        Stores key-value pairs in sorted order (by key, natural ordering or custom comparator).
        Does not allow null key.

    4. Hashtable
        Legacy class.
        Thread-safe (synchronized), but slower.
        Does not allow null key or value.


4. Commonly Used Methods of Map
    put(K key, V value) → insert key-value pair
    get(Object key) → get value for a key
    remove(Object key) → remove entry by key
    containsKey(Object key) → check if key exists
    containsValue(Object value) → check if value exists
    keySet() → returns all keys as Set
    values() → returns all values as Collection
    entrySet() → returns all entries (key=value)


5. Example Code (HashMap)

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "JavaScript");

        // Printing the map
        System.out.println("Map: " + map);

        // Accessing elements
        System.out.println("Key 2 → " + map.get(2));

        // Checking key and value
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Java'? " + map.containsValue("Java"));

        // Iterating using entrySet
        System.out.println("\nIterating Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}


6. Output Example

Map: {1=Java, 2=Python, 3=C++, 4=JavaScript}
Key 2 → Python
Contains key 3? true
Contains value 'Java'? true

Iterating Map:
1 → Java
2 → Python
3 → C++
4 → JavaScript


         */

        
    }
}
