package day49_Multithreading.Thread_DeadLock;



// Dead Lock Example

class Resource {
    String name;


    Resource(String name) {
        this.name = name;
    }
}

public class DeadlockDemo {
    public static void main(String[] args) {
        Resource lock1 = new Resource("Lock1");
        Resource lock2 = new Resource("Lock2");

        // Thread 1 tries to lock lock1 then lock2
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding " + lock1.name);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1: Waiting for " + lock2.name);
                synchronized (lock2) {
                    System.out.println("Thread 1: Got " + lock2.name);
                }
            }
        });

        // Thread 2 tries to lock lock2 then lock1
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding " + lock2.name);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2: Waiting for " + lock1.name);
                synchronized (lock1) {
                    System.out.println("Thread 2: Got " + lock1.name);
                }
            }
        });

        t1.start();
        t2.start();
    }
}

/*

Thread 1: Holding Lock1
Thread 2: Holding Lock2
Thread 2: Waiting for Lock1
Thread 1: Waiting for Lock2



 */
