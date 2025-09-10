package day49_Multithreading.Thread_Safety;

import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockExample {
    private final ReentrantLock lock = new ReentrantLock();
    private int counter = 0;

    public void increment() {
        lock.lock();   // acquire lock
        try {
            counter++;
        } finally {
            lock.unlock(); // always release lock
        }
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockExample ex = new ReentrantLockExample();

        Thread t1 = new Thread(() -> { for (int i=0; i<1000; i++) ex.increment(); });
        Thread t2 = new Thread(() -> { for (int i=0; i<1000; i++) ex.increment(); });

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Counter: " + ex.getCounter()); // always 2000
    }
}

//Counter: 2000


//Explanation
//Only one thread executes counter++ at a time.
//Unlike synchronized, we can use advanced lock features like tryLock() or timed lock.