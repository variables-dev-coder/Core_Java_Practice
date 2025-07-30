package day30_Collection_basics;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Chery");

        System.out.println(fruits);   // [Mango, Banana, Apple, Chery]
    }
}
