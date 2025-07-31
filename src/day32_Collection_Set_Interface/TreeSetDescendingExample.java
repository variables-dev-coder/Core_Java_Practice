package day32_Collection_Set_Interface;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDescendingExample {
    public static void main(String[] args) {
        // TreeSet stores elements in natural order by default
        TreeSet<String> names = new TreeSet<>();

        names.add("Zara");
        names.add("Amit");
        names.add("Munna");
        names.add("Riya");

        // Create a descending view using descendingSet()
        NavigableSet<String> descendingNames = names.descendingSet();

        System.out.println("Names in Descending Order:");
        for (String name : descendingNames) {
            System.out.println(name);
        }
    }
}

/*
Zara
Riya
Munna
Amit

 */