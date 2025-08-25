package Day40_Collection_Linked_List;

import java.util.Arrays;
import java.util.LinkedList;

public class MiddleElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60));

        int mid = list.size() / 2;

        System.out.println("Middle element: " + list.get(mid));
    }
}

//Middle Element: 40