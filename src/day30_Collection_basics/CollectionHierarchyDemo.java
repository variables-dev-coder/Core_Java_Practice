package day30_Collection_basics;

import java.util.*;

public class CollectionHierarchyDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        Queue<String> queue = new LinkedList<>();

        Map<Integer, String> map = new HashMap<>();

        list.add("Munna");
        set.add(100);
        queue.add("Spring");
        map.put(1, "Java");

        System.out.println(list);  // [Munna]
        System.out.println(set);   // [100]
        System.out.println(queue); // [Spring]
        System.out.println(map);   // {1=java}
    }
}
