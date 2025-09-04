package day49_Multithreading.BasicOfMultithreading;


//Explain Thread Lifecycle with example.
//States → New → Runnable → Running → Waiting/Timed Waiting → Terminated


class LifecycleDemo extends Thread {
    public void run() {
        System.out.println(getName() + " is running...");
    }
}

public class Q8 {
    public static void main(String[] args) throws Exception {
        LifecycleDemo t = new LifecycleDemo();

        System.out.println("Before start: " + t.getState());   // NEW
        t.start();
        System.out.println("After start: " + t.getState());    // RUNNABLE
        t.join();
        System.out.println("After join: " + t.getState());     // TERMINATED
    }
}


/*

Before start: NEW
After start: RUNNABLE
Thread-0 is running...
After join: TERMINATED

Dry Run:
Thread created → NEW
t.start() → moves to RUNNABLE
Scheduler picks → RUNNING
t finishes → TERMINATED

 */