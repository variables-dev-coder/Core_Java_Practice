package day49_Multithreading.BasicOfMultithreading;

//Write a program to create multiple threads that print numbers from 1 to 5

class PrintTask extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(getName() + " → " + i);
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        PrintTask t1 = new PrintTask();
        PrintTask t2 = new PrintTask();

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start();
        t2.start();
    }
}

/*

Thread-A → 1
Thread-A → 2
Thread-A → 3
Thread-A → 4
Thread-A → 5
Thread-B → 1
Thread-B → 2
Thread-B → 3
Thread-B → 4
Thread-B → 5


Dry Run:
Main thread creates Thread-A & Thread-B
t1.start() → Thread-A prints numbers
t2.start() → Thread-B prints numbers
Output interleaved → depends on scheduler

 */