package day49_Multithreading.Synchronization;

//Reentrant Synchronization
//Java’s locks are reentrant (a thread holding a lock can reacquire it).

class ReentrantExample {
    public synchronized void outer() {
        System.out.println("Outer acquired by " + Thread.currentThread().getName());
        inner(); // same lock re-acquired
    }

    public synchronized void inner() {
        System.out.println("Inner acquired by " + Thread.currentThread().getName());
    }
}


public class ReentrantDemo {
    public static void main(String[] args) {
        ReentrantExample r = new ReentrantExample();
        new Thread(r::outer, "T1").start();
    }
}

/*

Outer acquired by T1
Inner acquired by T1

Dry Run
T1 enters outer() → acquires lock on r.
Calls inner() → tries to acquire the same lock again.
Allowed because lock is reentrant → doesn’t deadlock.




Summary of Concepts

Synchronized method → lock on object (this).
Synchronized block → lock on chosen object.
Static synchronized → lock on class object.
Object vs Class lock → instance locks are separate, class lock is shared.
Reentrancy → same thread can re-acquire the lock.
Visibility guarantee → ensures threads see each other’s changes.


 */