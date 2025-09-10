package day49_Multithreading.Thread_Safety;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int getValue() {
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicCounter ex = new AtomicCounter();
        Thread t1 = new Thread(() -> { for (int i=0; i<1000; i++) ex.increment(); });
        Thread t2 = new Thread(() -> { for (int i=0; i<1000; i++) ex.increment(); });

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Final Count: " + ex.getValue()); // always 2000
    }
}

//Final Count: 2000

//Dry Run:
//incrementAndGet() is atomic.
//No race conditions → final result is always 2000.