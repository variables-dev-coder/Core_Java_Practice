package day62_Generics_Class_Method;

// Generic Minimum Element in List

import java.util.Arrays;
import java.util.List;

class Util3 {
    public static <T extends Comparable<T>> T min(List<T> list) {
        T min = list.get(0);
        for (T item : list) {
            if (item.compareTo(min) < 0) min = item;
        }
        return min;
    }
}

public class UtilMain3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 5, 30, 2);
        System.out.println(Util3.min(nums)); // 2
    }
}
