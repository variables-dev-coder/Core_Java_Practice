package day38_Collection_interface;

import java.util.Collection;
import java.util.HashSet;

public class CollectionExample2 {
    public static void main(String[] args) {
        Collection<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Object[] arr = numbers.toArray();
        System.out.println("Array elements:");
        for(Object num : arr){
            System.out.println(num);
        }
    }
}

/*
Array elements:
20
10
30
 */