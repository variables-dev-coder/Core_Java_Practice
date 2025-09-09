package day49_Multithreading.Thread_DeadLock;

//Dining Philosophers Problem

class Chopstick {

}

class Philosopher extends Thread {
    private Chopstick left, right;

    Philosopher(Chopstick left, Chopstick right) {
        this.left = left; this.right = right;
    }

    public void run() {
        synchronized (left) {
            System.out.println(Thread.currentThread().getName() + " picked left chopstick");
            try { Thread.sleep(100); } catch (Exception e) {}
            synchronized (right) {
                System.out.println(Thread.currentThread().getName() + " picked right chopstick and eating");
            }
        }
    }
}

public class DiningPhilosophers {
    public static void main(String[] args) {
        Chopstick c1 = new Chopstick();
        Chopstick c2 = new Chopstick();
        Chopstick c3 = new Chopstick();
        Chopstick c4 = new Chopstick();
        Chopstick c5 = new Chopstick();

        new Philosopher(c1, c2).start();
        new Philosopher(c2, c3).start();
        new Philosopher(c3, c4).start();
        new Philosopher(c4, c5).start();
        new Philosopher(c5, c1).start(); // Deadlock circle
    }
}


/*

Thread-1 picked left chopstick
Thread-3 picked left chopstick
Thread-2 picked left chopstick
Thread-4 picked left chopstick
Thread-0 picked left chopstick



Explanation

Each philosopher picks left chopstick first.
Everyone waits for right chopstick.
Circle of waiting → Deadlock
Solution → Allow one philosopher to pick right chopstick first, or use waiter strategy.

 */