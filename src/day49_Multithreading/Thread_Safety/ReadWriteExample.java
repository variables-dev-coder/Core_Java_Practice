package day49_Multithreading.Thread_Safety;

import java.util.concurrent.locks.*;

class ReadWriteExample {
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private String message = "Hello";

    public void write(String msg) {
        rwLock.writeLock().lock();
        try {
            message = msg;
            System.out.println("Written: " + msg);
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    public String read() {
        rwLock.readLock().lock();
        try {
            return message;
        } finally {
            rwLock.readLock().unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteExample ex = new ReadWriteExample();

        Runnable reader = () -> {
            System.out.println("Read: " + ex.read());
        };

        Runnable writer = () -> {
            ex.write("Updated Message");
        };

        new Thread(reader).start();
        new Thread(reader).start();
        new Thread(writer).start();
    }
}

//Written: Updated Message
//Read: Hello
//Read: Hello


//Explanation
//Multiple readers can safely read at the same time.
//If a writer comes, all readers are blocked until writer finishes.