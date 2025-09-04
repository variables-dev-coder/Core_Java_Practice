package day49_Multithreading.BasicOfMultithreading;



class Worker1 extends Thread {
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println("Worker1 step " + i);
        }
    }
}

public class Q11 {
    public static void main(String[] args) throws InterruptedException {
        Worker1 w = new Worker1();
        w.start();
        w.join(); // main waits

        System.out.println("Main finished after worker1.");
    }
}

/*

Worker1 step 1
Worker1 step 2
Worker1 step 3
Main finished after worker1.

Dry Run:

Main starts worker
worker executes steps 1,2,3
main waits (join)
after worker finishes → main prints final message

 */