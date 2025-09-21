package day61_Garbage_Collection;


import java.lang.ref.WeakReference;

public class Easy2_WeakRef {
    public static void main(String[] args) {
        Object strong = new Object();
        WeakReference<Object> weak = new WeakReference<>(strong);
        System.out.println("before GC: weak.get() = " + weak.get());
        strong = null;
        System.gc();
        // give GC a tiny chance
        try { Thread.sleep(200); } catch (InterruptedException e) {}
        System.out.println("after GC: weak.get() = " + weak.get());
    }
}

//before GC: weak.get() = java.lang.Object@65ab7765
//after GC: weak.get() = null

//Expected: First print non-null, after GC likely null.
//Explanation: Shows WeakReference is cleared once no strong refs exist.