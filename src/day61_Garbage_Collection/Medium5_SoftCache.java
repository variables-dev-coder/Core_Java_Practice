package day61_Garbage_Collection;


import java.lang.ref.SoftReference;
import java.util.*;

public class Medium5_SoftCache {
    static Map<Integer, SoftReference<byte[]>> cache = new HashMap<>();
    public static byte[] get(int id) {
        SoftReference<byte[]> ref = cache.get(id);
        byte[] data = ref == null ? null : ref.get();
        if (data == null) {
            data = new byte[1024*100]; // simulated load
            cache.put(id, new SoftReference<>(data));
        }
        return data;
    }
    public static void main(String[] args) {
        for (int i=0;i<1000;i++){
            get(i);
        }
        System.out.println("Cache size: " + cache.size());
    }
}

// Cache size: 1000

// Explanation: Demonstrates soft refs for cache — they can be cleared under
// memory pressure, preventing OOM from caching.