package day49_Multithreading.Thread_Safety;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicExample {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); // atomic
    }

    public int getCount() {
        return count.get();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicExample ex = new AtomicExample();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) ex.increment();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) ex.increment();
        });

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Final Count: " + ex.getCount()); // always 2000
    }
}

//Final Count: 2000

//Explanation
//count.incrementAndGet() is atomic → no race condition.
//If we used a normal int count++, result would be inconsistent.
