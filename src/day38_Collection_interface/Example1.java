package day38_Collection_interface;

// Using Collection (Interface with ArrayList)

import java.util.ArrayList;
import java.util.Collection;

public class Example1 {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Munna");
        names.add("Aziz");
        names.add("Rahul");

        System.out.println("Collection Elements: " + names);
    }
}

// Collection Elements: [Munna, Aziz, Rahul]