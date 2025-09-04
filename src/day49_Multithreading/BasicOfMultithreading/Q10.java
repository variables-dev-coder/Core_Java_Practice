package day49_Multithreading.BasicOfMultithreading;

/*
What happens if we call start() twice on the same thread?
    It will throw IllegalThreadStateException.
    Because a thread can be started only once.
 */


class MyThread extends Thread {
    public void run() {
        System.out.println("Running...");
    }
}

public class Q10 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        t.start(); // Exception
    }
}

/*

Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:802)
	at day49_Multithreading.BasicOfMultithreading.Q10.main(Q10.java:20)
Running...

Dry Run:
t.start() → new thread created
t.start() again → JVM throws IllegalThreadStateException

 */