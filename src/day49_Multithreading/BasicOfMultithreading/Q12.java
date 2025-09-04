package day49_Multithreading.BasicOfMultithreading;


/*
What is thread priority in Java? Does it guarantee execution order?
    Thread priority ranges from 1 (MIN) to 10 (MAX), default is 5.
    Priority is a hint to scheduler, not a guarantee.

 */


class Task extends Thread {
    public void run() {
        System.out.println(getName() + " with priority " + getPriority());
    }
}

public class Q12 {
    public static void main(String[] args) {
        Task t1 = new Task();
        Task t2 = new Task();
        Task t3 = new Task();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.setName("Low");
        t2.setName("Normal");
        t3.setName("High");

        t1.start();
        t2.start();
        t3.start();
    }
}

/*

High with priority 10
Normal with priority 5
Low with priority 1

Dry Run:
All threads created
Scheduler may prefer High > Normal > Low
But output order is not guaranteed



 */