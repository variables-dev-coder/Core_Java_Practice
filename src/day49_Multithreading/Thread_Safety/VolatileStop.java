package day49_Multithreading.Thread_Safety;

class VolatileStop {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            // doing work
        }
        System.out.println("Stopped safely!");
    }

    public void stop() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileStop ex = new VolatileStop();
        Thread t = new Thread(ex::run);
        t.start();
        Thread.sleep(1000);
        ex.stop();
    }
}

//Stopped safely!


//Dry Run:
//Worker checks running.
//Main updates running=false.
//Because of volatile, worker sees update immediately and stops.