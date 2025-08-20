package day37_Iterable_Iterator;

/*
3. How is Iterator different from ListIterator?

Answer:
Iterator → Works with all Collection types, forward only.
ListIterator → Works only with List, supports both forward and backward traversal, also supports add() operation.

Example:

 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("X", "Y", "Z"));

        ListIterator<String> lit = list.listIterator();

        System.out.println("Forward:");
        while(lit.hasNext()) {
            System.out.println(lit.next());
        }

        System.out.println("Backward:");
        while(lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}

//Forward:
//X
//Y
//Z
//Backward:
//Z
//Y
//X
