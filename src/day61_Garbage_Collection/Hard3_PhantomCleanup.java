package day61_Garbage_Collection;

// Hard3_PhantomCleanup.java
import java.lang.ref.*;
import java.util.*;

public class Hard3_PhantomCleanup {
    static final ReferenceQueue<Payload> rq = new ReferenceQueue<>();
    static final List<PhantomReference<Payload>> refs = new ArrayList<>();
    static class Payload { byte[] data = new byte[1024*1024]; }
    public static void main(String[] args) throws Exception {
        Thread cleaner = new Thread(() -> {
            try {
                while (true) {
                    Reference<? extends Payload> r = rq.remove();
                    System.out.println("Cleaning after GC: " + r);
                }
            } catch (InterruptedException e) {}
        });
        cleaner.setDaemon(true);
        cleaner.start();
        for (int i=0;i<4;i++) {
            Payload p = new Payload();
            refs.add(new PhantomReference<>(p, rq));
            p = null;
            System.gc();
            Thread.sleep(200);
        }
        System.out.println("Done");
    }
}

//Cleaning after GC: java.lang.ref.PhantomReference@471cbf40
//Cleaning after GC: java.lang.ref.PhantomReference@39244a5d
//Cleaning after GC: java.lang.ref.PhantomReference@528a5c1d
//Cleaning after GC: java.lang.ref.PhantomReference@68c9bca7
//Done

//Explanation: Uses PhantomReference + ReferenceQueue + background cleaner thread for deterministic cleanup tasks.
