package day38_Collection_interface;

// Question: Convert an ArrayList into a thread-safe collection using Collections.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("DSA");

        List<String> syncList = Collections.synchronizedList(list);

        System.out.println("Synchronized List: " + syncList);
    }
}

//Synchronized List: [Java, Spring, DSA]