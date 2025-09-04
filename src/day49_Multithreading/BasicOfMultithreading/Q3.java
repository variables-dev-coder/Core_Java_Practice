package day49_Multithreading.BasicOfMultithreading;

//Demonstrate sleep() method by making a thread print numbers from 1–5 with 1-second delay.

class SleepDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000);  // 1 second pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        new SleepDemo().start();
    }
}

/*
Count: 1
Count: 2
Count: 3
Count: 4
Count: 5
 */

