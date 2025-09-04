package day49_Multithreading.BasicOfMultithreading;

//Create three threads and set different priorities (MAX_PRIORITY, NORM_PRIORITY, MIN_PRIORITY). Observe output.

class PriorityTask extends Thread {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println(getName() + " running with priority " + getPriority());
        }
    }
}


public class Q5 {
    public static void main(String[] args) {
        PriorityTask t1 = new PriorityTask();
        PriorityTask t2 = new PriorityTask();
        PriorityTask t3 = new PriorityTask();

        t1.setPriority(Thread.MIN_PRIORITY);  // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY);  // 10

        t1.setName("Low-Priority");
        t2.setName("Normal-Priority");
        t3.setName("High-Priority");

        t1.start();
        t2.start();
        t3.start();
    }
}

//Priority is not guaranteed, depends on OS thread scheduler.

/*
High-Priority running with priority 10
High-Priority running with priority 10
High-Priority running with priority 10
High-Priority running with priority 10
High-Priority running with priority 10
Normal-Priority running with priority 5
Normal-Priority running with priority 5
Normal-Priority running with priority 5
Normal-Priority running with priority 5
Normal-Priority running with priority 5
Low-Priority running with priority 1
Low-Priority running with priority 1
Low-Priority running with priority 1
Low-Priority running with priority 1
Low-Priority running with priority 1

 */