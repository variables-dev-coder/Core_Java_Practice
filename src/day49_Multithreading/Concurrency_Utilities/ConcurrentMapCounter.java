package day49_Multithreading.Concurrency_Utilities;


/*
Q4. Implement a concurrent map counter using ConcurrentHashMap.
Theory:
HashMap is not thread-safe.
ConcurrentHashMap allows concurrent updates.

 */


import java.util.concurrent.*;

public class ConcurrentMapCounter {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("count", 0);

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.merge("count", 1, Integer::sum);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Final Count: " + map.get("count"));
    }
}

/*
Dry Run:
Both threads update count safely.
Final result = 2000.

Final Count: 2000

 */