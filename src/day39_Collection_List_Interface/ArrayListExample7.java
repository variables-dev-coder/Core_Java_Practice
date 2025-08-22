package day39_Collection_List_Interface;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListExample7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Java");
        list.add("Hibernate");
        list.add("Spring");

        System.out.println("Original List: " + list);

        // Using HashSet to remove duplicates
        HashSet<String> set = new HashSet<>(list);

        // Convert back to ArrayList
        ArrayList<String> uniqueList = new ArrayList<>(set);

        System.out.println("After Removing Duplicates: " + uniqueList);
    }
}

/*
Original List: [Java, Spring, Java, Hibernate, Spring]
After Removing Duplicates: [Java, Hibernate, Spring]

ArrayList allows duplicates, but sometimes we want only unique elements.
Convert ArrayList → HashSet (since HashSet does not allow duplicates).
Then convert HashSet → ArrayList back again if ordering is needed.


 */