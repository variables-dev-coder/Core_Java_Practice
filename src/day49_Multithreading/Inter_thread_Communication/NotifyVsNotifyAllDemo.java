package day49_Multithreading.Inter_thread_Communication;




class Store {
    private int items = 0;
    private final int CAPACITY = 5;

    // Producer adds items
    public synchronized void produce() {
        while (items == CAPACITY) { // Store full
            try { wait(); } catch (InterruptedException e) {}
        }
        items++;
        System.out.println("Produced 1 item → Store size: " + items);

        // Use notifyAll so ALL waiting consumers know new item is available
        notifyAll();
    }

    // Consumer removes item
    public synchronized void consume(String consumerName) {
        while (items == 0) { // Store empty
            try { wait(); } catch (InterruptedException e) {}
        }
        items--;
        System.out.println(consumerName + " consumed 1 item → Store size: " + items);

        // Use notify so ONLY one producer wakes (not all)
        notify();
    }
}

public class NotifyVsNotifyAllDemo {
    public static void main(String[] args) {
        Store store = new Store();

        // Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                store.produce();
                try { Thread.sleep(300); } catch (Exception e) {}
            }
        });

        // Multiple Consumers
        Thread consumer1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                store.consume("Consumer1");
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        });

        Thread consumer2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                store.consume("Consumer2");
                try { Thread.sleep(600); } catch (Exception e) {}
            }
        });

        producer.start();
        consumer1.start();
        consumer2.start();
    }
}



/*

Produced 1 item → Store size: 1
Consumer2 consumed 1 item → Store size: 0
Produced 1 item → Store size: 1
Consumer1 consumed 1 item → Store size: 0
Produced 1 item → Store size: 1
Consumer2 consumed 1 item → Store size: 0
Produced 1 item → Store size: 1
Consumer1 consumed 1 item → Store size: 0
Produced 1 item → Store size: 1
Consumer2 consumed 1 item → Store size: 0
Produced 1 item → Store size: 1
Consumer1 consumed 1 item → Store size: 0
Produced 1 item → Store size: 1
Consumer2 consumed 1 item → Store size: 0
Produced 1 item → Store size: 1
Consumer1 consumed 1 item → Store size: 0
Produced 1 item → Store size: 1
Consumer2 consumed 1 item → Store size: 0
Produced 1 item → Store size: 1
Consumer1 consumed 1 item → Store size: 0

 */