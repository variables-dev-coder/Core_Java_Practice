package Day40_Collection_Linked_List;

import java.util.Arrays;
import java.util.LinkedList;

public class RotateList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;

        for (int i = 0; i < k; i++) {
            int last = list.removeLast();
            list.addFirst(last);
        }
        System.out.println("Rotated: " + list);
    }
}

//Rotated: [4, 5, 1, 2, 3]