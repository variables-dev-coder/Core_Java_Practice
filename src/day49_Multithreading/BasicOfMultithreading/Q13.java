package day49_Multithreading.BasicOfMultithreading;



class AliveCheck2 extends Thread {
    public void run() {
        System.out.println(getName() + " is running...");
    }
}

public class Q13 {
    public static void main(String[] args) throws InterruptedException {
        AliveCheck2 t = new AliveCheck2();
        t.setName("Worker");

        System.out.println("Before start: " + t.isAlive()); // false
        t.start();
        System.out.println("After start: " + t.isAlive());  // true
        t.join();
        System.out.println("After join: " + t.isAlive());   // false
    }
}

/*
Before start: false
After start: true
Worker is running...
After join: false

Dry Run:
Before start → false
After start → true
After join → false

 */