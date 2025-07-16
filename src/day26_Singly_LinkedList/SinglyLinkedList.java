package day26_Singly_LinkedList;



class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    // 1. Add node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);   // create new node
        newNode.next = head;             // point newNode to current head
        head = newNode;                  // make newNode the new head
    }

    // 2. Add node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);      // create new node
        if (head == null) {                 // if list is empty
            head = newNode;
            return;
        }

        Node temp = head;              // start from head
        while (temp.next != null) {    // traverse till last node
            temp = temp.next;
        }
        temp.next = newNode;            // link last node to newNode
    }

    // 3. Print the list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // 4. Search (int key)
    public boolean search(int key) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    // 5. get size()
    public int getSize() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // 6. deleteByValue(int key)
    public void deleteByValue(int key) {
        if (head == null)
            return;

        // case 1: key is in head
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != null && curr.next.data != key) {
            curr = curr.next;
        }

        // case 2: key not found
        if (curr.next == null)
            return;

        // Case 3: key found
        curr.next = curr.next.next;
    }

    // Main method
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addFirst(10);     // list: 10
        list.addLast(20);     // list: 10 -> 20
        list.addLast(30);     // list: 10 -> 20 -> 30

        list.printList();          // Output: 10 -> 20 -> 30 -> null


        // Search for 20
        System.out.println("Is 20 present? " + list.search(20));  // true

        // Get size
        System.out.println("Size of List: " + list.getSize());    // 3

        // Delete 10
        list.deleteByValue(10);
        System.out.print("After deleting 10: ");
        list.printList();          // Output: 20 -> 30 -> null

        list.deleteByValue(100);
        System.out.println("After deleting Non-existing value: ");
        list.printList();

        list.deleteByValue(30);
        System.out.println("After deleting 30: ");
        list.printList();

        list.deleteByValue(20);
        System.out.println("After deleting 20: ");   // null
        list.printList();

    }
}
