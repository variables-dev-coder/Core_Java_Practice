package day49_Multithreading.Thread_DeadLock;


//Deadlock with join()

public class JoinDeadlock {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Thread 1 waiting for Thread 2");
                Thread.currentThread().join(); // Deadlock: waits for itself
            } catch (Exception e) {}
        });

        t1.start();
    }
}

/*
Thread 1 waiting for Thread 2

Explanation
t1 tries to join() on itself.
A thread waits forever for itself to finish → Deadlock


 */