package day35_Collection_Utility_Classes;

// Frequency of Element in a List


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        int freq = Collections.frequency(list, "apple");
        System.out.println("Frequency of 'apple': " + freq);
    }
}
