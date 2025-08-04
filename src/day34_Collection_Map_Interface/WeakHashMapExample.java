package day34_Collection_Map_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<Object, String> hashMap = new HashMap<>();
        Map<Object, String> weakHashMap = new WeakHashMap<>();

        Object key1 = new String("Munna");  // creating objects as keys
        Object key2 = new String("Aziz");

        hashMap.put(key1, "HashMapValue");
        weakHashMap.put(key2, "WeakHashMapValue");

        // Remove strong references
        key1 = null;
        key2 = null;

        // Suggesting garbage collection
        System.gc();
        Thread.sleep(2000); // give GC time to collect

        System.out.println("HashMap: " + hashMap);
        System.out.println("WeakHashMap: " + weakHashMap); // might be empty
    }
}
