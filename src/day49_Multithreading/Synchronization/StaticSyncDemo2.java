package day49_Multithreading.Synchronization;

//Static Synchronization
//Locks the class object (shared across all objects).

class Printer2 {
    synchronized static void printMsg(String msg) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(msg + " - " + i);
            try { Thread.sleep(100); } catch(Exception e) {}
        }
    }
}

public class StaticSyncDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> Printer2.printMsg("Hello"));
        Thread t2 = new Thread(() -> Printer2.printMsg("World"));

        t1.start();
        t2.start();
    }
}

/*
World - 1
World - 2
World - 3
Hello - 1
Hello - 2
Hello - 3


Dry Run
Even though no objects are created, static synchronized locks the class-level lock.
So only one thread can execute printMsg() at a time.


 */