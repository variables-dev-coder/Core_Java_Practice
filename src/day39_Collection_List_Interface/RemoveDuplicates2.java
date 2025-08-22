package day39_Collection_List_Interface;

/*
Approach 2: Manual Way (Without Set)
If interviewer says don’t use HashSet, then:
Create a new ArrayList.
Traverse original list.
Add an element only if it’s not already present in the new list.
 */


import java.util.ArrayList;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        System.out.println("Original List: " + list);
        System.out.println("Unique List: " + uniqueList);
    }
}

/*
Original List: [10, 20, 10, 30, 40, 20, 50]
Unique List: [10, 20, 30, 40, 50]

 */