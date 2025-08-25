package Day40_Collection_Linked_List;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original: " + list);

        Collections.reverse(list);

        System.out.println("Reversed: " + list);
    }
}

//Original: [1, 2, 3, 4, 5]
//Reversed: [5, 4, 3, 2, 1]