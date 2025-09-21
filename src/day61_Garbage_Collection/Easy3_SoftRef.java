package day61_Garbage_Collection;


import java.lang.ref.SoftReference;

public class Easy3_SoftRef {
    public static void main(String[] args) {
        Object cached = new Object();
        SoftReference<Object> soft = new SoftReference<>(cached);
        cached = null;
        System.out.println("soft before: " + soft.get());
        System.gc();
        System.out.println("soft after GC (likely present unless memory pressured): " + soft.get());
    }
}

//soft before: java.lang.Object@65ab7765
//soft after GC (likely present unless memory pressured): java.lang.Object@65ab7765


//Explanation: SoftReference is retained unless JVM under memory pressure; useful for caches.