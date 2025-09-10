package day49_Multithreading.Thread_Safety;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLockExample {
    private ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private String data = "Initial";

    public void write(String value) {
        rwLock.writeLock().lock();
        try {
            data = value;
            System.out.println("Written: " + value);
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    public void read() {
        rwLock.readLock().lock();
        try {
            System.out.println("Read: " + data);
        } finally {
            rwLock.readLock().unlock();
        }
    }

    public static void main(String[] args) {
        RWLockExample ex = new RWLockExample();

        new Thread(() -> ex.read()).start();
        new Thread(() -> ex.read()).start();
        new Thread(() -> ex.write("Updated")).start();
    }
}

//Read: Initial
//Read: Initial
//Written: Updated



//Dry Run:
//Two readers can run together.
//Writer blocks until all readers release.