package day49_Multithreading.Synchronization;


//Synchronized Method
//Ensures only one thread can access the method at a time.


class Counter2 {
    private int count = 0;

    public synchronized void increment() {
        count++;  // critical section
    }

    public int getCount() {
        return count;
    }
}

public class SyncMethodDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Counter2 c = new Counter2();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

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
t1 and t2 both try to increment count.
Because increment() is synchronized, only one thread enters at a time.
Final count = 2000 (no data loss).


 */