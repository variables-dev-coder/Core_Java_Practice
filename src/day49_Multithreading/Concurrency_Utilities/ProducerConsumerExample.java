package day49_Multithreading.Concurrency_Utilities;


/*
BlockingQueue (Producer-Consumer)
Concept:
Thread-safe queue.
Producers put(), consumers take().
Blocks automatically if queue empty/full.

Example:
 */



import java.util.concurrent.*;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Runnable producer = () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {}
        };

        Runnable consumer = () -> {
            try {
                while (true) {
                    int item = queue.take();
                    System.out.println("Consumed: " + item);
                }
            } catch (InterruptedException e) {}
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

/*
Dry Run:
Producer puts items → blocks if queue full.
Consumer takes items → blocks if queue empty.


Produced: 1
Produced: 2
Produced: 3
Produced: 4
Produced: 5
Produced: 6
Consumed: 1
Consumed: 2
Consumed: 3
Consumed: 4
Consumed: 5
Consumed: 6
Produced: 7
Produced: 8
Produced: 9
Produced: 10
Consumed: 7
Consumed: 8
Consumed: 9
Consumed: 10
 */