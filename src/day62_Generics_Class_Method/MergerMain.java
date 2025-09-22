package day62_Generics_Class_Method;

//Generic Merge Two Sorted Lists

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Merger {
    public static <T extends Comparable<T>> List<T> merge(List<T> a, List<T> b) {
        List<T> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i).compareTo(b.get(j)) <= 0) result.add(a.get(i++));
            else result.add(b.get(j++));
        }
        while (i < a.size()) result.add(a.get(i++));
        while (j < b.size()) result.add(b.get(j++));
        return result;
    }
}

public class MergerMain {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        System.out.println(Merger.merge(list1, list2)); // [1,2,3,4,5,6]
    }
}
