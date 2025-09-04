package day49_Multithreading.BasicOfMultithreading;

//Check if a thread is alive using isAlive().

class AliveCheck extends Thread {
    public void run() {
        System.out.println(getName() + " is running...");
    }
}

public class Q6 {
    public static void main(String[] args) throws InterruptedException {
        AliveCheck t1 = new AliveCheck();
        t1.setName("TestThread");

        System.out.println("Before start: " + t1.isAlive());
        t1.start();
        System.out.println("After start: " + t1.isAlive());

        t1.join();
        System.out.println("After join: " + t1.isAlive());
    }
}


/*
Before start: false
After start: true
TestThread is running...
After join: false
 */