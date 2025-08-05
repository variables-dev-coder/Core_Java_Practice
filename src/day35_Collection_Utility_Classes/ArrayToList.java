package day35_Collection_Utility_Classes;


//  Arrays Utility Class - Practice Programs
// Sort Array and Convert to List

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1};

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        Integer[] boxedArr = {5, 2, 8, 1};
        List<Integer> list = Arrays.asList(boxedArr);
        System.out.println("Converted List: " + list);
    }
}
