package day41_Collection_Vector_Legacy_Class;

// How to iterate over a Vector?
// 4 ways


import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IterateVector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("A");
        v.add("B");
        v.add("C");

        // 1 : For loop
        for (int i = 0; i < v.size(); i++)
            System.out.println(v.get(i));

        // 2 : For - each loop
        for (String s : v)
            System.out.println(s);

        // 3 : Iterator
        Iterator<String> it = v.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        // 4 : Enumeration (Legacy)
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}


/*


Q5: Why is Vector considered a legacy class? Should we still use it?

Answer:
Legacy because it was introduced in JDK 1.0, before Collections Framework (JDK 1.2).
It was later retrofitted to implement List.
Modern usage: Avoid unless synchronization is specifically needed.
Prefer ArrayList + Collections.synchronizedList() or CopyOnWriteArrayList.


 */