package day38_Collection_interface;

// Using Collection with HashSet

import java.util.Collection;
import java.util.HashSet;

public class Example3 {
    public static void main(String[] args) {
        Collection<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored

        System.out.println("HashSet via Collection: " + set);
    }
}

// HashSet via Collection: [20, 10]