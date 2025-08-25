package Day40_Collection_Linked_List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 2, 3, 4, 5, 6, 4, 7, 8, 9, 1, 10));

        System.out.println("Original: " + list);

        HashSet<Integer> set = new HashSet<>(list);
        LinkedList<Integer> uniqueList = new LinkedList<>(set);

        System.out.println("After Removing Duplicates: " + uniqueList);
    }
}

//Original: [1, 2, 3, 2, 3, 4, 5, 6, 4, 7, 8, 9, 1, 10]
//After Removing Duplicates: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]