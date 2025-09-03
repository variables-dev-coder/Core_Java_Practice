package day48_Collection_Map_Interface;




import java.util.*;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // true → access order
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity; // remove oldest if size exceeds
    }
}

public class LRUCacheExample {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        System.out.println("Cache: " + cache);

        // Access key 1 (so 1 becomes recently used)
        cache.get(1);
        cache.put(4, "D"); // Exceeds capacity → removes least recently used (key 2)
        System.out.println("Cache after inserting 4: " + cache);

        cache.get(3); // 3 becomes recently used
        cache.put(5, "E"); // Removes LRU (key 1)
        System.out.println("Cache after inserting 5: " + cache);
    }
}

/*
Cache: {1=A, 2=B, 3=C}
Cache after inserting 4: {3=C, 1=A, 4=D}
Cache after inserting 5: {4=D, 3=C, 5=E}


Real-world Use Cases:
Browser Cache → Most visited pages stay, least used are removed.
Database Cache → Query results stored, old results evicted.
OS Page Replacement → Least recently used memory pages swapped out.
Backend Systems → Redis/Memcached use similar eviction policies.


 */