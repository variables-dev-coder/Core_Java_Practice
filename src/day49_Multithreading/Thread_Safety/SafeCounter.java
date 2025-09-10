package day49_Multithreading.Thread_Safety;

import java.util.concurrent.locks.ReentrantLock;

public class SafeCounter {
    private ReentrantLock lock = new ReentrantLock();
    private int count = 0;

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        SafeCounter ex = new SafeCounter();
        Thread t1 = new Thread(() -> { for (int i=0; i<1000; i++) ex.increment(); });
        Thread t2 = new Thread(() -> { for (int i=0; i<1000; i++) ex.increment(); });

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Count: " + ex.getCount()); // always 2000
    }
}


//Count: 2000

//Dry Run:
//Lock ensures only one thread increments at a time.
//Final result always correct.