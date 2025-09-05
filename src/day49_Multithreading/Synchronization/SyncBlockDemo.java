package day49_Multithreading.Synchronization;

//Synchronized Block
//Gives more control → synchronize only a part of the code.


class Table {
    void printTable(int n) {
        synchronized(this) {   // synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try { Thread.sleep(100); } catch(Exception e) {}
            }
        }
    }
}

public class SyncBlockDemo {
    public static void main(String[] args) {
        Table obj = new Table();

        Thread t1 = new Thread(() -> obj.printTable(2));
        Thread t2 = new Thread(() -> obj.printTable(5));

        t1.start();
        t2.start();
    }
}

/*
2
4
6
8
10
5
10
15
20
25


Dry Run
Both threads want to execute printTable().
Only one at a time enters the synchronized(this) block.
No mixed outputs like 2 10 4 20.... Output is clean, one table at a time.



 */