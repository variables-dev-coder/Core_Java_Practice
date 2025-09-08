package day49_Multithreading.Inter_thread_Communication;



//Multi-Thread Chat Simulation (notifyAll)

class Chat {
    private boolean questionAsked = false;

    public synchronized void askQuestion(String msg) {
        while (questionAsked) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Question: " + msg);
        questionAsked = true;
        notifyAll();
    }

    public synchronized void answer(String name, String msg) {
        while (!questionAsked) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println(name + " answered: " + msg);
        questionAsked = false;
        notifyAll();
    }
}

public class ChatDemo {
    public static void main(String[] args) {
        Chat chat = new Chat();

        Thread q = new Thread(() -> {
            chat.askQuestion("What is Multithreading?");
            chat.askQuestion("What is Synchronization?");
        });

        Thread a1 = new Thread(() -> chat.answer("Alice", "Multithreading allows concurrent tasks."));
        Thread a2 = new Thread(() -> chat.answer("Bob", "Synchronization prevents race conditions."));

        q.start(); a1.start(); a2.start();
    }
}

