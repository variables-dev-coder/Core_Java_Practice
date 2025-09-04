package day49_Multithreading.BasicOfMultithreading;

//Q1. Create two threads using Thread class. Each thread should print numbers from 1 to 5.

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        NumberThread t2 = new NumberThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t1.start();
    }

}

//Output will be interleaved (Thread-1 -> 1, Thread-2 -> 1, …).