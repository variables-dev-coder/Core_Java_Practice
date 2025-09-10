package day49_Multithreading.Thread_Safety;

import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {
    private ReentrantLock lock1 = new ReentrantLock();
    private ReentrantLock lock2 = new ReentrantLock();

    public void task1() {
        if (lock1.tryLock()) {
            try {
                Thread.sleep(100);
                if (lock2.tryLock()) {
                    try {
                        System.out.println("Task1 acquired both locks");
                    } finally {
                        lock2.unlock();
                    }
                }
            } catch (Exception e) {}
            finally {
                lock1.unlock();
            }
        }
    }

    public void task2() {
        if (lock2.tryLock()) {
            try {
                Thread.sleep(100);
                if (lock1.tryLock()) {
                    try {
                        System.out.println("Task2 acquired both locks");
                    } finally {
                        lock1.unlock();
                    }
                }
            } catch (Exception e) {}
            finally {
                lock2.unlock();
            }
        }
    }

    public static void main(String[] args) {
        TryLockExample ex = new TryLockExample();
        new Thread(ex::task1).start();
        new Thread(ex::task2).start();
    }
}



//Task1 acquired both locks

//Dry Run:
//If one thread can’t acquire second lock, it releases first one.
//Prevents deadlock.

