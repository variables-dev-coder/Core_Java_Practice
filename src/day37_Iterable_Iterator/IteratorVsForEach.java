package day37_Iterable_Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorVsForEach {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three");

        // Using Iterator explicitly
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator: " + it.next());
        }

        // Using Iterable with enhanced for-loop
        for (String str : list) {
            System.out.println("For-each: " + str);
        }
    }
}

/*
Iterator: One
Iterator: Two
Iterator: Three
For-each: One
For-each: Two
For-each: Three

 */