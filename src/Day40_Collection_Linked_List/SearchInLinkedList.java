package Day40_Collection_Linked_List;

public class SearchInLinkedList {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // head of linked list

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Search element in LinkedList
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true; // element found
            }
            current = current.next;
        }
        return false; // element not found
    }

    // Display LinkedList
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        SearchInLinkedList list = new SearchInLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();

        int key = 30;
        if (list.search(key)) {
            System.out.println("Element " + key + " found in LinkedList.");
        } else {
            System.out.println("Element " + key + " not found in LinkedList.");
        }

        key = 50;
        if (list.search(key)) {
            System.out.println("Element " + key + " found in LinkedList.");
        } else {
            System.out.println("Element " + key + " not found in LinkedList.");
        }
    }
}

/*

10 -> 20 -> 30 -> 40 -> null
Element 30 found in LinkedList.
Element 50 not found in LinkedList.

 */