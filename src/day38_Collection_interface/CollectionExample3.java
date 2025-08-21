package day38_Collection_interface;

// retainAll() and removeAll()

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample3 {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("Java");
        c1.add("Python");
        c1.add("C++");

        Collection<String> c2 = new ArrayList<>();
        c2.add("Java");
        c2.add("C#");

        // retain common elements
        c1.retainAll(c2);
        System.out.println("Common Elements: " + c1); // Java

        // removeAll example
        c2.removeAll(c1);
        System.out.println("After removeAll: " + c2); // C#
    }
}

/*
Common Elements: [Java]
After removeAll: [C#]
 */