package day49_Multithreading.Inter_thread_Communication;

//Simple Ping-Pong Game (notify)

class PingPong {
    private boolean pingTurn = true;

    public synchronized void ping() {
        while (!pingTurn) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Ping");
        pingTurn = false;
        notify();
    }

    public synchronized void pong() {
        while (pingTurn) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Pong");
        pingTurn = true;
        notify();
    }
}
public class PingPongDemo {
    public static void main(String[] args) {
        PingPong game = new PingPong();

        Thread t1 = new Thread(() -> { for (int i=0;i<5;i++) game.ping(); });
        Thread t2 = new Thread(() -> { for (int i=0;i<5;i++) game.pong(); });

        t1.start(); t2.start();
    }

}

/*
Ping
Pong
Ping
Pong
Ping
Pong
Ping
Pong
Ping
Pong
 */