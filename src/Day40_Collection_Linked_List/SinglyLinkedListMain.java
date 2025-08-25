package Day40_Collection_Linked_List;



class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // Insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at specific index
    public void insertAtIndex(int index, int data) {
        if (index == 0) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Index out of range!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Traverse & print
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtIndex(1, 15); // Insert 15 at index 1

        list.printList(); // Output: 10 → 15 → 20 → 30 → null
    }
}

/*

Operations:
1.Insert at Head – Add new node at the beginning.
2.Insert at Tail – Add new node at the end.
3.Insert at Specific Index – Add new node at any given position.



 */