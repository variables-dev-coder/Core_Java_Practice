package day30_Collection_basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Munna");
        names.add("Ravi");
        names.add("Tom");

        //Using Iterator from Iterable
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Using enhance for loop because of Iterable
        for (String name : names) {
            System.out.println(name);
        }

        //Using forEach() ( Java 8 )
        names.forEach(System.out::println);
    }
}

/*
Munna
Ravi
Tom
Munna
Ravi
Tom
Munna
Ravi
Tom


 */