package Day40_Collection_Linked_List;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class MergeLists {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(2, 4, 6));

        list1.addAll(list2);
        Collections.sort(list1);

        System.out.println("Merged List: " + list1);
    }
}
