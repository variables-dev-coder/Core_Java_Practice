package day37_Iterable_Iterator;

/*
1. What is the difference between Iterable and Iterator in Java?

Answer:
Iterable is an interface that represents a collection that can be traversed using an Iterator.
It has the iterator() method.
Iterator is an interface that provides methods (hasNext(), next(), remove()) to iterate elements.

Example:

 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableVsIterator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        // Iterable provides the iterator()
        Iterable<String> iterable = list;

        // Get Iterator
        Iterator<String> it = iterable.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
//A
//B
//C