package day49_Multithreading.Thread_Safety;

class VolatileExample {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            // do work
        }
        System.out.println("Stopped!");
    }

    public void stop() {
        running = false; // visible immediately to other threads
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample ex = new VolatileExample();

        Thread t = new Thread(ex::run);
        t.start();

        Thread.sleep(1000);
        ex.stop();
    }
}

//Stopped!


//Explanation
//volatile ensures the main thread’s update (stop()) is visible to the worker thread.
//Without it, worker might loop forever due to caching.


