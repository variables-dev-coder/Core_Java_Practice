package day62_Generics_Class_Method;

// Generic Method Using Wildcards (<? extends Number>)

import java.util.Arrays;
import java.util.List;

class Util4 {
    public static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) total += n.doubleValue();
        return total;
    }
}

public class UtilMain4 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(2.5, 3.5);
        System.out.println(Util4.sum(nums));    // 6.0
        System.out.println(Util4.sum(doubles)); // 6.0
    }
}
