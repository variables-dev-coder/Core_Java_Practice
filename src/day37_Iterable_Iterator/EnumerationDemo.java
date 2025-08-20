package day37_Iterable_Iterator;

/*
4. What is the difference between Enumeration and Iterator?

Answer:
Enumeration (legacy, used with old classes like Vector, Hashtable) → has hasMoreElements() and nextElement().
Iterator (modern, for all collections) → has hasNext(), next(), remove().

Example:
 */

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("One");
        v.add("Two");
        v.add("Three");

        Enumeration<String> e = v.elements();

        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

//One
//Two
//Three