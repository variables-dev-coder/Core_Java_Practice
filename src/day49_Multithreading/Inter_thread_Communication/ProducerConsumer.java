package day49_Multithreading.Inter_thread_Communication;


//Producer-Consumer Problem (Single Buffer)
//Classic Interview Example


class Buffer {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        available = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 3; i++) buffer.produce(i);
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 3; i++) buffer.consume();
        });

        producer.start();
        consumer.start();
    }
}

/*
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Consumed: 3



Dry Run
Producer puts 1, notifies consumer.
Consumer takes 1, notifies producer.
Repeats for 2 and 3.
No deadlocks, no busy waiting.



 */