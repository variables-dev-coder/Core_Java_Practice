package day31_Collection_List_Interface;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Jerry");
        names.add("Bull");
        names.add("Jerry");    // duplicated allowed
        names.add("Cat");
        names.add("Null");   // List are null values allowed
        names.add("Rocky");

        System.out.println("List: " + names);    // List: [Tom, Jerry, Bull, Jerry, Cat, Null, Rocky]
        System.out.println("Third element: " + names.get(3));   // index based, Third element: Jerry

        names.remove(2);  // Remove  Bull
        System.out.println("After remove: " + names);   // After remove: [Tom, Jerry, Jerry, Cat, Null, Rocky]
    }
}
