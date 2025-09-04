package day49_Multithreading.BasicOfMultithreading;

//Use join() so the main thread waits until a worker thread finishes execution.

class Worker extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Worker Running Step " + i);
        }
    }
}

public class Q4 {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();

        worker.join();  // main waits until worker completes

        System.out.println("Main thread finished after worker.");

    }
}

/*
Worker Running Step 1
Worker Running Step 2
Worker Running Step 3
Main thread finished after worker.

 */