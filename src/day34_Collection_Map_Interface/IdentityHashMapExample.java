package day34_Collection_Map_Interface;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        // Create two String objects with same value
        String key1 = new String("Munna");
        String key2 = new String("Munna");

        // HashMap compares by content
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(key1, "Value1");
        hashMap.put(key2, "Value2");

        System.out.println("HashMap size: " + hashMap.size()); // 👉 1

        // IdentityHashMap compares by reference
        Map<String, String> identityMap = new IdentityHashMap<>();
        identityMap.put(key1, "Value1");
        identityMap.put(key2, "Value2");

        System.out.println("IdentityHashMap size: " + identityMap.size()); // 👉 2
    }
}
