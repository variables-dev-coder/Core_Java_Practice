package day49_Multithreading;

public class Notes {
    public static void main(String[] args) {


        /*

What is Multithreading?
    Multithreading is the process of executing multiple threads simultaneously within a single program.
    A thread is the smallest unit of execution inside a process.
    Java provides built-in support for multithreading through the Thread class and the Runnable interface.

Why Multithreading?
    Efficient CPU utilization – multiple tasks can run in parallel.
    Faster execution – especially useful for tasks like downloading, file processing, and handling multiple client requests.
    Better responsiveness – e.g., GUI applications remain responsive while doing background tasks.

Process vs Thread
    Process: Independent execution unit with its own memory.
    Thread: A lightweight execution unit inside a process that shares memory with other threads.

Thread Lifecycle
A thread in Java goes through these states:
    New – created but not started (Thread t = new Thread();)
    Runnable – ready to run (t.start())
    Running – executing task
    Waiting/Timed Waiting – waiting for another thread to signal
    Terminated – finished execution

Ways to Create a Thread

1. Extending Thread class

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class TestThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // starts new thread
    }
}


2.Implementing Runnable interface

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread running...");
    }
}

public class TestRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}


Common Thread Methods
    start() → starts a thread (calls run() internally).
    run() → defines task for thread.
    sleep(ms) → pauses thread for given time.
    join() → waits for thread to finish.
    setPriority(int) → sets thread priority (1–10).
    isAlive() → checks if thread is still running.

Example with Multiple Threads
class Task1 extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Task 1 - " + i);
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Task 2 - " + i);
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start();
        t2.start();
    }
}
Output will be interleaved because both threads run simultaneously.

Real-time Use Cases
    Web servers → handling multiple client requests.
    Games → rendering graphics & processing user input together.
    Banking systems → handling multiple transactions at once.
    Background tasks → downloading files while browsing continues.


Thread Synchronization in Java
    When multiple threads access shared resources (like variables, objects, files,
    databases) at the same time, it can lead to data inconsistency.
    Synchronization ensures that only one thread at a time can access the shared resource.

Example Problem (Without Synchronization)

class Counter {
    int count = 0;

    public void increment() {
        count++; // not thread-safe
    }
}

public class SyncProblemDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.count);
    }
}

Expected output = 2000, but sometimes you’ll get less (like 1890, 1975, etc.).
Reason: Both threads are modifying count at the same time.


Solution: synchronized Keyword
We make increment() thread-safe by locking it:

class Counter {
    int count = 0;

    public synchronized void increment() {
        count++; // thread-safe
    }
}

Now final count will always be 2000.


Types of Synchronization

1.Method Synchronization
    Use synchronized keyword on a method.
    Example: public synchronized void increment() { ... }

2.Block Synchronization
    Only synchronize a specific part of code.

public void increment() {
    synchronized(this) {
        count++;
    }
}


3.Static Synchronization
    If multiple threads access static data, use synchronized on a static method.

public static synchronized void print() { ... }

Real-life Example: Bank Account

class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() +
                               " withdrew " + amount + ", balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                               " insufficient balance!");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "User1");
        Thread t2 = new Thread(() -> account.withdraw(500), "User2");

        t1.start();
        t2.start();
    }
}

Synchronization prevents race conditions in withdrawals.

Important Notes
    Synchronization reduces performance (threads wait for lock).
    Use it only when needed.
    For higher performance → use Lock API (ReentrantLock) or java.util.concurrent package.





         */


    }
}
