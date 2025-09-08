package day49_Multithreading.Inter_thread_Communication;

//Odd-Even Number Printing (notify)

class OddEvenPrinter {
    private int num = 1;
    private final int MAX = 10;
    private boolean oddTurn = true;

    public synchronized void printOdd() {
        while (num <= MAX) {
            while (!oddTurn) {
                try { wait(); } catch (InterruptedException e) {}
            }
            System.out.println("Odd: " + num++);
            oddTurn = false;
            notify();
        }
    }

    public synchronized void printEven() {
        while (num <= MAX) {
            while (oddTurn) {
                try { wait(); } catch (InterruptedException e) {}
            }
            System.out.println("Even: " + num++);
            oddTurn = true;
            notify();
        }
    }
}

public class OddEvenDemo {
    public static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter();
        new Thread(printer::printOdd).start();
        new Thread(printer::printEven).start();
    }
}

/*

Odd: 1
Even: 2
Odd: 3
Even: 4
Odd: 5
Even: 6
Odd: 7
Even: 8
Odd: 9
Even: 10
Odd: 11

 */