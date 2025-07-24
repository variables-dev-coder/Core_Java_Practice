package day27_Doubly_Linked_List;

// Convert Doubly Linked List (DLL) to Array or List
// Convert the entire DLL into a Java Array or an ArrayList.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DoublyNode15 {
    int data;
    DoublyNode15 prev;
    DoublyNode15 next;

    DoublyNode15(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLL_ToArray {
    DoublyNode15 head;

    public void insertAtEnd(int data) {
        DoublyNode15 newNode = new DoublyNode15(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode15 temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    public int getLength() {
        int count = 0;
        DoublyNode15 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public int[] toArray() {
        int[] arr = new int[getLength()];
        DoublyNode15 temp = head;
        int i = 0;
        while (temp != null) {
            arr[i++] = temp.data;
            temp = temp.next;
        }
        return arr;
    }

    public List<Integer> toArrayList() {
        List<Integer> list = new ArrayList<>();
        DoublyNode15 temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }

    public static void main(String[] args) {
        DLL_ToArray list = new DLL_ToArray();

        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);

        // Convert to Array
        int[] arr = list.toArray();
        System.out.println("DLL as Array: " + Arrays.toString(arr));

        // Convert to ArrayList
        List<Integer> arrayList = list.toArrayList();
        System.out.println("DLL as ArrayList: " + arrayList);
    }
}
