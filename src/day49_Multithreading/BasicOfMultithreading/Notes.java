package day49_Multithreading.BasicOfMultithreading;

public class Notes {
    public static void main(String[] args) {


        /*

1. Basics of Java Multithreading

What is Multithreading?
    Multithreading means running multiple threads (small units of execution) at
    the same time inside a single Java program.
        It improves performance & CPU utilization.
        Used in real-world apps like web servers, games, GUIs, file downloaders.


Process vs Thread

| Feature       | Process                                   | Thread                                         |
| ------------- | ----------------------------------------- | ---------------------------------------------- |
| Definition    | Independent program in execution          | Lightweight unit of execution inside a process |
| Memory        | Each process has its own memory           | Threads share memory of the process            |
| Communication | IPC (Inter-Process Communication → heavy) | Easier, since memory is shared                 |
| Example       | Chrome browser process                    | Multiple tabs inside Chrome = threads          |


Thread Lifecycle

A thread goes through 5 states:
    New → Thread is created but not started (Thread t = new Thread();)
    Runnable → After calling start(), ready to run, waiting for CPU
    Running → Actively executing run() method
    Waiting/Timed Waiting → Waiting for another thread (join(), sleep(), wait())
    Terminated (Dead) → Thread completed execution

Creating Threads
1. Extending Thread class

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running using Thread class...");
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // start a new thread
    }
}


2. Implementing Runnable interface

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable interface...");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}


Common Thread Methods

| Method             | Description                                  |
| ------------------ | -------------------------------------------- |
| `start()`          | Starts the thread (calls `run()` internally) |
| `run()`            | Code that will be executed by thread         |
| `sleep(ms)`        | Makes the thread sleep for given time        |
| `join()`           | Waits for thread to finish                   |
| `setPriority(int)` | Sets thread priority (1–10)                  |
| `getName()`        | Returns thread’s name                        |
| `isAlive()`        | Checks if thread is still running            |



Example with Multiple Threads & Methods

class Task extends Thread {
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // pause 0.5 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadMethodsDemo {
    public static void main(String[] args) throws InterruptedException {
        Task t1 = new Task();
        Task t2 = new Task();

        t1.setName("Worker-1");
        t2.setName("Worker-2");

        t1.start();
        t2.start();

        t1.join(); // main waits until t1 finishes
        t2.join();

        System.out.println("Main thread finished after workers.");
    }
}


Now you fully understand Basics of Multithreading:

What it is
Process vs Thread
Lifecycle
Thread creation (Thread & Runnable)
Thread methods with example



         */
    }
}
