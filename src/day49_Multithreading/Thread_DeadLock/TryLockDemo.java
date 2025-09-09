package day49_Multithreading.Thread_DeadLock;


//tryLock() with Timeout (ReentrantLock)


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

//Thread 2 got both locks