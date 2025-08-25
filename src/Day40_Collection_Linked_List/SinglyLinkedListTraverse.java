package Day40_Collection_Linked_List;


class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList3 {
    Node3 head;

    // Insert at end for testing
    public void insertAtEnd(int data) {
        Node3 newNode = new Node3(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node3 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Traverse & Print
    public void traverse() {
        Node3 temp = head;
        if (temp == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


public class SinglyLinkedListTraverse {
    public static void main(String[] args) {
        SinglyLinkedList3 list = new SinglyLinkedList3();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.traverse(); // Output: Linked List: 10 20 30
    }
}

//Linked List: 10 20 30

/*
Approach:

Start from the head node.

Use a loop to move through each node until null.

Print data of every node.
 */