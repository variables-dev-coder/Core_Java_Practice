package Day40_Collection_Linked_List;


// Node class
class Node4 {
    int data;
    Node4 next;

    Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class SinglyLinkedList4 {
    Node4 head;

    // Insert at end (to build a list)
    public void insertAtEnd(int data) {
        Node4 newNode = new Node4(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node4 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Count number of nodes
    public int countNodes() {
        int count = 0;
        Node4 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Display list
    public void display() {
        Node4 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Main class
public class LinkedListCountNodes {
    public static void main(String[] args) {
        SinglyLinkedList4 list = new SinglyLinkedList4();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.display();
        System.out.println("Total nodes in LinkedList = " + list.countNodes());
    }
}

/*
10 -> 20 -> 30 -> 40 -> null
Total nodes in LinkedList = 4
 */