package day49_Multithreading.Concurrency_Utilities;


/*
Q2. Implement a producer-consumer system using BlockingQueue.
Theory:
Avoids wait()/notify().
Producer put() blocks when queue full.
Consumer take() blocks when queue empty.
 */


import java.util.concurrent.*;

public class BlockingQueuePC {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        Runnable producer = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.put(i);
                    System.out.println("Produced " + i);
                }
            } catch (InterruptedException e) {}
        };

        Runnable consumer = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    int val = queue.take();
                    System.out.println("Consumed " + val);
                }
            } catch (InterruptedException e) {}
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

/*
Produced 1
Produced 2
Produced 3
Produced 4
Consumed 1
Consumed 2
Consumed 3
Consumed 4
Produced 5
Consumed 5

Dry Run:
Producer inserts 1, 2, 3 → queue full.
Consumer takes items → frees space.
Producer continues.



 */