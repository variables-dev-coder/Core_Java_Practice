package day37_Iterable_Iterator;

import java.util.*;

class MyCollection implements Iterable<String> {
    private List<String> data = Arrays.asList("Java", "Spring", "Microservices");

    @Override
    public Iterator<String> iterator() {
        return data.iterator(); // return internal list iterator
    }
}

public class CustomIterableExample {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();

        for (String item : myCollection) {
            System.out.println(item);
        }
    }
}

//Java
//Spring
//Microservices