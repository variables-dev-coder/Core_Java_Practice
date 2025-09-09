package day49_Multithreading.Thread_DeadLock;

public class Notes {
    public static void main(String[] args) {

        /*

What is Deadlock?
-----------------
Deadlock happens when two or more threads are permanently blocked, waiting for each other’s resources.
Imagine:
    Thread A has Lock1, wants Lock2.
    Thread B has Lock2, wants Lock1.
    Both are stuck forever → Deadlock.

--------------------------------------------------


Conditions for Deadlock
-----------------------
A deadlock occurs if these 4 conditions hold simultaneously (called Coffman conditions):
    1.Mutual Exclusion – Resource can be held by only one thread at a time.
    2.Hold and Wait – Thread holds one resource and waits for another.
    3.No Preemption – Resources cannot be forcibly taken away.
    4.Circular Wait – A cycle of threads waiting for each other’s resources.
If even one condition is broken → deadlock is avoided.


------------------------------------------------------



Example: Deadlock in Java


class Resource {
    String name;
    Resource(String name) { this.name = name; }
}

public class DeadlockDemo {
    public static void main(String[] args) {
        Resource lock1 = new Resource("Lock1");
        Resource lock2 = new Resource("Lock2");

        // Thread 1 tries to lock lock1 then lock2
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding " + lock1.name);
                try { Thread.sleep(100); } catch (Exception e) {}

                System.out.println("Thread 1: Waiting for " + lock2.name);
                synchronized (lock2) {
                    System.out.println("Thread 1: Got " + lock2.name);
                }
            }
        });

        // Thread 2 tries to lock lock2 then lock1
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding " + lock2.name);
                try { Thread.sleep(100); } catch (Exception e) {}

                System.out.println("Thread 2: Waiting for " + lock1.name);
                synchronized (lock1) {
                    System.out.println("Thread 2: Got " + lock1.name);
                }
            }
        });

        t1.start();
        t2.start();
    }
}

Output (example):

Thread 1: Holding Lock1
Thread 2: Holding Lock2
Thread 1: Waiting for Lock2
Thread 2: Waiting for Lock1

Both threads wait forever → Deadlock ❌


-------------------------------------------------------------------



How to Avoid Deadlock?
----------------------
1. Lock Ordering
Always acquire locks in a consistent order.

synchronized (lock1) {
    synchronized (lock2) {
        // Safe
    }
}


If both threads follow the same order → no circular wait.


--------------------------------------------------------------------


2. tryLock() with Timeout (ReentrantLock)
Instead of waiting forever, try acquiring a lock with timeout.

import java.util.concurrent.locks.*;

public class TryLockDemo {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            try {
                if (lock1.tryLock() && lock2.tryLock()) {
                    System.out.println("Thread 1 got both locks");
                }
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                if (lock2.tryLock() && lock1.tryLock()) {
                    System.out.println("Thread 2 got both locks");
                }
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        });

        t1.start();
        t2.start();
    }
}

If a lock isn’t available, tryLock() returns false instead of waiting → avoids deadlock.




--------------------------------------------------------



3. Deadlock Detection
In complex apps (databases, OS), deadlocks can be detected by:
    Building a wait-for graph of threads → detect cycles.
    Killing/restarting one thread to resolve.


--------------------------------------------------------------



4. Use Fewer Locks
Minimize locking by using immutable objects or concurrent data structures
(ConcurrentHashMap, CopyOnWriteArrayList).



----------------------------------------------------------------


Real-Life Analogy
Two people need spoon and fork to eat noodles:
    Person A picks spoon, waits for fork.
    Person B picks fork, waits for spoon.
    They starve forever → deadlock.
    Solution: Always pick spoon first, then fork → lock ordering.



-------------------------------------------------------------------


Now you know:
What is deadlock
Why it happens
Example code
Ways to avoid it (lock ordering, tryLock, detection, fewer locks)


===========================================================================




         */
    }
}
