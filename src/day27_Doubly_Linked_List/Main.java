package day27_Doubly_Linked_List;


// Covered Methods: 1. deleteFromIndex(int index), 2. deleteFromFront(), 3. deleteFromEnd()


class Node4 {
    int data;
    Node4 next;
    Node4 prev;

    Node4(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList_4 {
    Node4 head;

    // Add to end for test purposes
    public void addToEnd(int data) {
        Node4 newNode = new Node4(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node4 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // 1. Delete from front
    public void deleteFromFront() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.println("Deleting from front: " + head.data);
        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    // 2. Delete from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            System.out.println("Deleting from end: " + head.data);
            head = null;
            return;
        }

        Node4 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.println("Deleting from end: " + temp.data);
        temp.prev.next = null;
    }

    // 3. Delete from specific index
    public void deleteFromIndex(int index) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (index == 0) {
            deleteFromFront();
            return;
        }

        Node4 current = head;
        int count = 0;

        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        System.out.println("Deleting from index " + index + ": " + current.data);

        if (current.prev != null) {
            current.prev.next = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    // Display list
    public void printList() {
        Node4 temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList_4 list = new DoublyLinkedList_4();

        // Add some nodes
        list.addToEnd(10);
        list.addToEnd(20);
        list.addToEnd(30);
        list.addToEnd(40);
        list.addToEnd(50);
        list.printList();  // Output: 10 20 30 40 50

        // Delete from front
        list.deleteFromFront();  // Deletes 10
        list.printList();        // Output: 20 30 40 50

        // Delete from end
        list.deleteFromEnd();    // Deletes 50
        list.printList();        // Output: 20 30 40

        // Delete from index 1 (0-based, deletes 30)
        list.deleteFromIndex(1);
        list.printList();        // Output: 20 40
    }
}

