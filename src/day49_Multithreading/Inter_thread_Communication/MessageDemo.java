package day49_Multithreading.Inter_thread_Communication;



class Message1 {
    private String msg;
    private boolean hasMessage = false;

    public synchronized void write(String m) {
        while (hasMessage) {  // wait until old message is read
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        msg = m;
        hasMessage = true;
        System.out.println("Produced: " + msg);
        notify();  // signal reader
    }

    public synchronized String read() {
        while (!hasMessage) {  // wait until a message is written
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasMessage = false;
        System.out.println("Consumed: " + msg);
        notify();  // signal writer
        return msg;
    }
}


public class MessageDemo {
    public static void main(String[] args) {
        Message1 message = new Message1();

        // Writer thread
        Thread writer = new Thread(() -> {
            String[] texts = {"Hello", "How are you?", "Goodbye"};
            for (String t : texts) {
                message.write(t);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // Reader thread
        Thread reader = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                message.read();
                try {
                    Thread.sleep(800);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        writer.start();
        reader.start();
    }
}


//Produced: Hello
//Consumed: Hello
//Produced: How are you?
//Consumed: How are you?
//Produced: Goodbye
//Consumed: Goodbye