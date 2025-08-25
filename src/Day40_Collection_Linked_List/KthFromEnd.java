package Day40_Collection_Linked_List;

import java.util.Arrays;
import java.util.LinkedList;

public class KthFromEnd {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 2;

        int index = list.size() - k;
        System.out.println(k + "th Element from End: " + list.get(index));
    }
}

//2th Element from End: 40