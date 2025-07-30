package day30_Collections_basics;

import java.util.ArrayList;
import java.util.List;

public class ListExample01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Munna");
        names.add("Aziz");
        names.add("Pooja");
        names.add("Munna");   // duplicate allowed
        names.add("null");

        System.out.println("List: " + names);     // List: [Munna, Aziz, Pooja, Munna]
        System.out.println("First element: " + names.get(1));   // first index element: Aziz

        names.remove(3);     // Remove last index 3 "Munna"
        System.out.println("After remove: " + names);  // After remove: [Munna, Aziz, Pooja]

    }
}

/*

Maintains Order        Yes (insertion order preserved)
Allows Duplicates      Yes
Index-based Access     Yes
Null Elements Allowed  Yes


 */