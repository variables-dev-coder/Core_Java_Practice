package day37_Iterable_Iterator;

/*
5. Why does Iterator not support index-based access?

Answer:
Because Iterator is designed for sequential traversal, not for random access.
If you need index-based access → use List (get(index) method).
If you only need to traverse safely → use Iterator.

Example:

 */


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorIndex {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        // Iterator way (sequential)
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Index-based (direct random access)
        System.out.println("Index 1 -> " + list.get(1)); // B
    }
}

//A
//B
//C
//Index 1 -> B