package day27_Doubly_Linked_List;



class Node3 {
    int data;
    Node3 prev;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


public  class DoublyLinkedList_3 {

    Node3 head;

    // Add to front
    public void addToFront(int data) {
        Node3 newNode = new Node3(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    // Add to end
    public void addToEnd(int data) {
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
        newNode.prev = temp;
    }

    // Print Forward
    public void printForward() {
        Node3 temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print backward
    public void printBackward() {
        Node3 temp = head;
        // Got to last Node
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Inset At Index
    public void insertAtIndex(int index, int data) {
        Node3 newNode = new Node3(data);

        if (index == 0) {
            addToFront(data);
            return;
        }

        Node3 current = head;
        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;
    }


    public static void main(String[] args) {

        DoublyLinkedList_3 list = new DoublyLinkedList_3();

        list.addToEnd(10);
        list.addToEnd(20);
        list.addToEnd(40);

        // Insert at index 2 (between 20 and 40)
        list.insertAtIndex(2, 30); // List becomes: 10 <-> 20 <-> 30 <-> 40

        // Insert at front using index 0
        list.insertAtIndex(0, 5);  // List becomes: 5 <-> 10 <-> 20 <-> 30 <-> 40

        list.printForward();

        list.printBackward();

    }
}
