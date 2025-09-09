package day49_Multithreading.Thread_DeadLock;

//Producer-Consumer with Wrong Lock Ordering

class SharedBuffer {
    final Object lock1 = new Object();
    final Object lock2 = new Object();
}

public class ProducerConsumerDeadlock {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {
            synchronized (buffer.lock1) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (buffer.lock2) {
                    System.out.println("Producer added item");
                }
            }
        });

        Thread consumer = new Thread(() -> {
            synchronized (buffer.lock2) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (buffer.lock1) {
                    System.out.println("Consumer removed item");
                }
            }
        });

        producer.start();
        consumer.start();
    }
}

/*
Explanation
Producer → lock1 → lock2
Consumer → lock2 → lock1
Opposite lock order → Deadlock 
 */
