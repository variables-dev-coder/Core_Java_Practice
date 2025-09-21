package day61_Garbage_Collection;


import java.lang.ref.*;

public class Easy4_Phantom {
    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue<Object> queue = new ReferenceQueue<>();
        Object obj = new Object();
        PhantomReference<Object> pr = new PhantomReference<>(obj, queue);
        obj = null;
        System.gc();
        Thread.sleep(200);
        Reference<?> ref = queue.poll();
        System.out.println("Reference queued? " + (ref != null));
    }
}

// Reference queued? true

// Explanation: PhantomReference used to detect when object finalized and ready for reclaim; get() returns null.