package day49_Multithreading.Concurrency_Utilities;

/*
Concurrent Collections
(a) ConcurrentHashMap
Thread-safe map.
Allows concurrent reads and segmented writes.
 */


import java.util.concurrent.*;

public class ConcurrentMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Java", 1);

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                map.merge("Java", 1, Integer::sum);
            }
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}


// No return type
