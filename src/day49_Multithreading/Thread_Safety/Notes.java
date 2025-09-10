package day49_Multithreading.Thread_Safety;

public class Notes {
    public static void main(String[] args) {
        /*


1. What is Thread Safety?
-------------------------
    A program is thread-safe if multiple threads can run simultaneously without corrupting
    shared data or producing inconsistent results.

    Problems usually come from race conditions → when multiple threads read/write shared variables at the same time.


2. volatile Keyword
-------------------
Concept
    Ensures visibility of variable updates across threads.
    Without volatile, one thread might see a stale cached value.
    Does not guarantee atomicity (operations like count++ are still unsafe).

Example

class VolatileExample {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            // do work
        }
        System.out.println("Stopped!");
    }

    public void stop() {
        running = false; // visible immediately to other threads
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample ex = new VolatileExample();

        Thread t = new Thread(ex::run);
        t.start();

        Thread.sleep(1000);
        ex.stop();
    }
}



Explanation
    volatile ensures the main thread’s update (stop()) is visible to the worker thread.
    Without it, worker might loop forever due to caching.


-----------------------------------------------------------


3. Atomic Variables
-------------------
Concept
    Package: java.util.concurrent.atomic
    Provides atomic operations (like increment) without explicit synchronization.
    Examples: AtomicInteger, AtomicLong, AtomicBoolean.

Example

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


Explanation

count.incrementAndGet() is atomic → no race condition.
If we used a normal int count++, result would be inconsistent.


4. Locks – ReentrantLock
------------------------
Concept
More powerful alternative to synchronized.
Features:
    ✔ Try acquiring lock (tryLock())
    ✔ Interruptible locks
    ✔ Fairness policy (first-come-first-serve).


Example

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


Explanation
Only one thread executes counter++ at a time.
Unlike synchronized, we can use advanced lock features like tryLock() or timed lock.


5. ReadWriteLock
----------------
Concept
Provided by ReentrantReadWriteLock.
Allows:
    ✔ Multiple readers at the same time (if no writers).
    ✔ Only one writer at a time, blocking all readers.
     Best for scenarios with more reads than writes (e.g., caching, config loading).

Example

import java.util.concurrent.locks.*;

class ReadWriteExample {
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private String message = "Hello";

    public void write(String msg) {
        rwLock.writeLock().lock();
        try {
            message = msg;
            System.out.println("Written: " + msg);
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    public String read() {
        rwLock.readLock().lock();
        try {
            return message;
        } finally {
            rwLock.readLock().unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteExample ex = new ReadWriteExample();

        Runnable reader = () -> {
            System.out.println("Read: " + ex.read());
        };

        Runnable writer = () -> {
            ex.write("Updated Message");
        };

        new Thread(reader).start();
        new Thread(reader).start();
        new Thread(writer).start();
    }
}

Explanation
    Multiple readers can safely read at the same time.
    If a writer comes, all readers are blocked until writer finishes.


Summary
-------
    volatile → ensures visibility, but not atomicity.
    Atomic Variables → provide atomic operations without locks.
    ReentrantLock → advanced locking with tryLock, fairness.
    ReadWriteLock → multiple readers, one writer.
    These tools ensure thread safety in different scenarios.


=====================================================================


Theory Questions
----------------
Q1. What is thread safety?
Answer:
Thread safety means that multiple threads can access a shared resource without corrupting data
or producing inconsistent results.
Achieved using synchronization, locks, volatile, atomic variables, etc.



Q2. Difference between volatile and synchronized?
Answer:
volatile → ensures visibility (all threads see updated value). No locking.
synchronized → ensures atomicity + visibility (only one thread executes critical section).



Q3. When should you use AtomicInteger instead of synchronized?
Answer:
Use AtomicInteger when you only need atomic operations (increment, get, set).
Use synchronized/locks when you need to protect complex critical sections.



Q4. What is the difference between ReentrantLock and synchronized?
Answer:
Both provide mutual exclusion.
ReentrantLock offers:
    ✔ tryLock() with timeout
    ✔ Fairness policy
    ✔ Condition variables
synchronized is simpler but less flexible.



Q5. When to use ReadWriteLock?
Answer:
Use when reads are frequent but writes are rare.
Multiple readers can access simultaneously, but only one writer at a time.




         */
    }
}
