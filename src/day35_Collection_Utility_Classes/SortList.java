package day35_Collection_Utility_Classes;


// 1. Sort a List in Ascending and Descending Order

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 8, 3, 2);

        Collections.sort(list);
        System.out.println("Ascending: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending: " + list);
    }
}
