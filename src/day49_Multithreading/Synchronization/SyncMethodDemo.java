package day49_Multithreading.Synchronization;

/*
1. Synchronized Method (Instance Lock)
When a method is declared synchronized, the object’s monitor lock is acquired before execution.
 */

class Counter {
    private int count = 0;

    // synchronized method -> lock on 'this'
    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class SyncMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> { for (int i = 0; i < 1000; i++) c.increment(); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < 1000; i++) c.increment(); });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.getCount());
    }

}

//Final Count: 2000

/*
Dry Run

t1 calls increment() → acquires lock on c → executes → releases lock.
t2 calls increment() → must wait if t1 is inside → then executes.
Both threads together add 2000.
Safe, no lost updates.


 */