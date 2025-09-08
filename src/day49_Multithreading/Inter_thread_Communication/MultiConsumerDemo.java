package day49_Multithreading.Inter_thread_Communication;




//Multiple Consumers on a Queue (notifyAll)


import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 3;

    public synchronized void produce(int value) {
        while (queue.size() == LIMIT) {
            try { wait(); } catch (InterruptedException e) {}
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notifyAll(); // multiple consumers waiting
    }

    public synchronized void consume(String name) {
        while (queue.isEmpty()) {
            try { wait(); } catch (InterruptedException e) {}
        }
        int val = queue.poll();
        System.out.println(name + " consumed: " + val);
        notify(); // only one producer needed
    }
}

public class MultiConsumerDemo {
    public static void main(String[] args) {
        SharedQueue sq = new SharedQueue();

        Thread producer = new Thread(() -> {
            for (int i=1;i<=6;i++) {
                sq.produce(i);
                try { Thread.sleep(300); } catch (Exception e) {}
            }
        });

        Thread consumer1 = new Thread(() -> { for(int i=0;i<3;i++) sq.consume("C1"); });
        Thread consumer2 = new Thread(() -> { for(int i=0;i<3;i++) sq.consume("C2"); });

        producer.start();
        consumer1.start();
        consumer2.start();
    }
}

/*
Produced: 1
C2 consumed: 1
Produced: 2
C2 consumed: 2
Produced: 3
C2 consumed: 3
Produced: 4
C1 consumed: 4
Produced: 5
C1 consumed: 5
Produced: 6
C1 consumed: 6

 */