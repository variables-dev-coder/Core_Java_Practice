package day49_Multithreading.Synchronization;

//Static Synchronization (Class Level Lock)
//Lock is on the Class object, shared across all instances.

class IdGenerator {
    private static int id = 1;

    public static synchronized int nextId() {
        return id++;
    }
}

public class StaticSyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> { for(int i=0;i<3;i++) System.out.println("T1 got " + IdGenerator.nextId()); });
        Thread t2 = new Thread(() -> { for(int i=0;i<3;i++) System.out.println("T2 got " + IdGenerator.nextId()); });

        t1.start(); t2.start();
        t1.join(); t2.join();
    }

}

/*

T2 got 2
T2 got 3
T2 got 4
T1 got 1
T1 got 5
T1 got 6


Dry Run
    T1 and T2 both call nextId().
    Since it’s static synchronized, lock is on IdGenerator.class.
    Only one thread at a time can generate ID.
    IDs are unique and sequential.



 */