package day49_Multithreading.Thread_DeadLock;


// Classic Deadlock (Two Threads, Two Locks)

class ClassicDeadlock {
    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 holding lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread 1 got lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 holding lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 waiting for lock1");
                synchronized (lock1) {
                    System.out.println("Thread 2 got lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

/*
Thread 1 holding lock1
Thread 2 holding lock2
Thread 2 waiting for lock1
Thread 1 waiting for lock2

Explanation

t1 → lock1 then lock2
t2 → lock2 then lock1
Both wait forever → Deadlock

 */