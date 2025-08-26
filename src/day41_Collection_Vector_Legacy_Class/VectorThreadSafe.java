package day41_Collection_Vector_Legacy_Class;

/*
How do you ensure thread safety when using a Vector?

Concept: Vector methods are synchronized, but iteration may still cause ConcurrentModificationException.
Solution: Use synchronized block or Enumeration.
 */


import java.util.Iterator;
import java.util.Vector;

public class VectorThreadSafe {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);

        synchronized(vector) {
            Iterator<Integer> it = vector.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}

//10
//20
//30