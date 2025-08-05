package day35_Collection_Utility_Classes;


//  Find Maximum and Minimum in a List

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMinList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20, 10, 50, 30);

        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
    }
}
