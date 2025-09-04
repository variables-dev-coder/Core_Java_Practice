package day49_Multithreading.BasicOfMultithreading;

/*

Difference between start() and run() in Thread?
    start() → Creates a new thread, internally calls run().
    run() → Just a normal method call; no new thread is created.

 */


class DemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }
}

public class Q7 {
    public static void main(String[] args) {
        DemonThread t = new DemonThread();

        t.run();    // runs in main thread (no new thread)
        t.start();   // create a new thread
    }
}

//main is running...
//Thread-0 is running...

//Dry Run:
//main() calls t.run() → prints using main thread
//main() calls t.start() → JVM creates new thread → prints using Thread-0