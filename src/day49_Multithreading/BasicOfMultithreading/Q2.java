package day49_Multithreading.BasicOfMultithreading;



class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello from Runnable - " + Thread.currentThread().getName());
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Worker-A");
        t1.start();
    }
}

/*
Hello from Runnable - Worker-A
Hello from Runnable - Worker-A
Hello from Runnable - Worker-A
 */