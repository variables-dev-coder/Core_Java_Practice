package day26_Singly_LinkedList;

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList_2 {
    Node2 head;

    // 1. Add at beginning
    public void addFirst(int data) {
        Node2 newNode = new Node2(data);
        newNode.next = head;
        head = newNode;
    }

    // 2. Add at end
    public void addLast(int data) {
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 3. Print list
    public void printList() {
        Node2 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // 4. Search a key
    public boolean search(int key) {
        Node2 temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // 5. Get list size
    public int getSize() {
        int count = 0;
        Node2 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {
        SinglyLinkedList_2 list = new SinglyLinkedList_2();

        list.addFirst(10);     // 10
        list.addLast(20);      // 10 -> 20
        list.addLast(30);      // 10 -> 20 -> 30

        list.printList();      // Output: 10 -> 20 -> 30 -> null
        System.out.println("Found 20? " + list.search(20));          // true
        System.out.println("Size of List: " + list.getSize());       // 3
    }
}
