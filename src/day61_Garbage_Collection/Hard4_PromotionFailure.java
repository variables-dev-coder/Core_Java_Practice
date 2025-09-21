package day61_Garbage_Collection;


import java.util.*;

public class Hard4_PromotionFailure {
    public static void main(String[] args) throws Exception {
        List<byte[]> survivors = new ArrayList<>();
        for (int i=0;i<2000;i++) {
            byte[] a = new byte[1024*50]; // many objects
            if (i % 100 == 0) survivors.add(a); // hold some to promote
            if (i % 500 == 0) System.gc();
        }
        System.out.println("Holding survivors: " + survivors.size());
    }
}

//Holding survivors: 20


// Explanation: If promotion space is insufficient, collector must do full
// GC/compaction; analyze logs to see promotion failure. Use -Xlog:gc to inspect.