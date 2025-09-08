package day49_Multithreading.Inter_thread_Communication;



class SharedData {
    private String data;
    private boolean available = false;

    // Writer method
    public synchronized void write(String value) {
        while (available) { // wait if old data not consumed
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notifyAll();  // wake up ALL waiting readers
    }

    // Reader method
    public synchronized String read(String readerName) {
        while (!available) { // wait if no data available
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        System.out.println(readerName + " consumed: " + data);
        notifyAll();  // wake up Writer and other readers
        return data;
    }
}


public class NotifyAllDemo2 {
    public static void main(String[] args) {
        SharedData buffer = new SharedData();

        // Writer thread
        Thread writer = new Thread(() -> {
            String[] texts = {"Message1", "Message2", "Message3"};
            for (String t : texts) {
                buffer.write(t);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // Multiple Reader threads
        Thread reader1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                buffer.read("Reader1");
                try {
                    Thread.sleep(800);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread reader2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                buffer.read("Reader2");
                try {
                    Thread.sleep(900);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        writer.start();
        reader1.start();
        reader2.start();
    }
}

/*
Produced: Message1
Reader2 consumed: Message1
Produced: Message2
Reader1 consumed: Message2
Produced: Message3
Reader2 consumed: Message3

 */