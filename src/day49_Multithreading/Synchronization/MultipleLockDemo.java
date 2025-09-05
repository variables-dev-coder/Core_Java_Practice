package day49_Multithreading.Synchronization;


//Synchronized Block with Different Locks
//You can synchronize on different objects → improves concurrency.


class Task {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    void task1() {
        synchronized(lock1) {
            System.out.println("Task1 running...");
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }

    void task2() {
        synchronized(lock2) {
            System.out.println("Task2 running...");
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}

public class MultipleLockDemo {
    public static void main(String[] args) {
        Task t = new Task();

        new Thread(t::task1).start();
        new Thread(t::task2).start();
    }
}

/*
Task1 running...
Task2 running...

Dry Run
task1() locks on lock1.
task2() locks on lock2.
Since they’re different locks, both can run simultaneously → better performance.


 */
