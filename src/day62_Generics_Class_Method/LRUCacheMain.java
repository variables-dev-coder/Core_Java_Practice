package day62_Generics_Class_Method;

// Generic LRU Cache (Least Recently Used)

import java.util.LinkedHashMap;
import java.util.Map;


class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > capacity;
    }
}

public class LRUCacheMain {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(2);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C"); // removes key=1
        System.out.println(cache); // {2=B, 3=C}
    }
}
