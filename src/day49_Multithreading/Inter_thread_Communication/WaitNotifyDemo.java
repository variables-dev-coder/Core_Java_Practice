package day49_Multithreading.Inter_thread_Communication;

/*

Q1. Theory
-----------
Q: Why do we need wait(), notify(), and notifyAll() when we already have synchronization?

A:
    Synchronization ensures mutual exclusion (only one thread in critical section).
    But sometimes, threads need to communicate and wait for conditions (like producer waiting until consumer consumes).
    Without wait(), threads would use busy waiting (wasting CPU cycles).
    With wait(), a thread can pause and release the lock until another thread signals with notify() or notifyAll().


 */

//Q2. Coding – Simple wait/notify Example
//Two threads: one waits, another notifies


class Message {
    private String msg;

    public synchronized void waitForMessage() {
        try {
            System.out.println(Thread.currentThread().getName() + " waiting...");
            wait();
            System.out.println("Got message: " + msg);
        } catch (InterruptedException e) {}
    }

    public synchronized void sendMessage(String msg) {
        this.msg = msg;
        System.out.println("Message sent: " + msg);
        notify(); // wake up waiting thread
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Message m = new Message();

        new Thread(() -> m.waitForMessage(), "Thread-1").start();

        try { Thread.sleep(1000); } catch(Exception e) {}
        new Thread(() -> m.sendMessage("Hello from Thread-2"), "Thread-2").start();
    }
}

//Thread-1 waiting...
//Message sent: Hello from Thread-2
//Got message: Hello from Thread-2



/*

Dry Run
Thread-1 calls waitForMessage() → enters wait state, releases lock.
Thread-2 calls sendMessage("Hello...") → sets message, calls notify().
Thread-1 wakes up → prints “Got message: Hello from Thread-2”.




 */