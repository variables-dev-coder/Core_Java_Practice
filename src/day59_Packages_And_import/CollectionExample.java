package day59_Packages_And_import;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Microservices");

        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
