package day49_Multithreading.Inter_thread_Communication;

public class Notes {
    public static void main(String[] args) {


        /*


1. What is Inter-thread Communication?
--------------------------------------
    Threads often need to talk to each other (coordinate).
    Example: One thread produces data, another consumes it → they must wait and signal properly.
    Java provides wait(), notify(), notifyAll() for this.
    Without this, threads may end up busy waiting (constantly checking a condition), wasting CPU.


=======================================



2. Methods used
---------------
All 3 methods are defined in the Object class (not Thread class), because every object can be used as a lock.

    wait() → Tells the current thread to release the lock and go into waiting state until another thread calls
    notify() or notifyAll() on the same object.

    notify() → Wakes up one thread waiting on the object’s lock.

    notifyAll() → Wakes up all threads waiting on the object’s lock.

Must be called inside a synchronized block/method, otherwise IllegalMonitorStateException.



======================================




3. Classic Example – Producer-Consumer Problem
----------------------------------------------
    Producer generates data, Consumer uses it.
    They must work in turns, not overwrite or read empty data.


=======================================



Example: Single-slot buffer
---------------------------


class SharedBuffer {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available) { // if buffer is full, wait
            try { wait(); } catch (InterruptedException e) {}
        }
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify(); // signal consumer
    }

    public synchronized int consume() {
        while (!available) { // if buffer empty, wait
            try { wait(); } catch (InterruptedException e) {}
        }
        available = false;
        System.out.println("Consumed: " + data);
        notify(); // signal producer
        return data;
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                try { Thread.sleep(500); } catch(Exception e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
                try { Thread.sleep(800); } catch(Exception e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}


Explanation + Dry Run
----------------------
    SharedBuffer starts empty (available=false).
    Producer calls produce(1):
        Buffer empty → stores 1, sets available=true, prints Produced: 1.
        Calls notify() → wakes up consumer.

Consumer calls consume():
    Buffer has 1, prints Consumed: 1, sets available=false.
    Calls notify() → wakes up producer.

Process repeats for 2, 3, 4, 5.

If producer is too fast → it waits until consumer consumes.
If consumer is too fast → it waits until producer produces.
Perfect coordination.


=========================================



4. Why while instead of if in wait-check?
-----------------------------------------
Because even after being notified, thread may not get CPU immediately, or multiple consumers may wake up.

So always re-check the condition in a loop.



==========================================


5. Real-world Analogy
---------------------
    Producer = Chef cooking food
    Consumer = Waiter serving food
    Buffer = Kitchen counter (only 1 dish space).
    Chef waits if counter is full.
    Waiter waits if counter is empty.
        → Both coordinate properly.



==========================================


6. Summary
----------
    wait(): thread goes to waiting state, releases lock.
    notify(): wakes up one waiting thread.
    notifyAll(): wakes all waiting threads.
    Used inside synchronized methods/blocks.
    Classic problem: Producer-Consumer with shared buffer.



==========================================





         */
    }
}
