package day29_Circular_Doubly_Linked_List;

// Circular Doubly Linked List Implementation
public class CircularDoublyLinkedList {

    // Node class
    static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head = null;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head.prev = head;
        } else {
            Node tail = head.prev;
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head.prev = head;
        } else {
            Node tail = head.prev;
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
        }
    }

    // Insert at position
    public void insertAtPosition(int data, int pos) {
        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
            if (temp == head) {
                System.out.println("Position out of range.");
                return;
            }
        }
        Node nextNode = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = nextNode;
        nextNode.prev = newNode;
    }

    // Delete from beginning
    public void deleteFromBeginning() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
        } else {
            Node tail = head.prev;
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    // Delete from end
    public void deleteFromEnd() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
        } else {
            Node tail = head.prev;
            Node newTail = tail.prev;
            newTail.next = head;
            head.prev = newTail;
        }
    }

    // Delete at position
    public void deleteAtPosition(int pos) {
        if (head == null) return;
        if (pos == 1) {
            deleteFromBeginning();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
            if (temp == head) {
                System.out.println("Position out of range.");
                return;
            }
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    // Delete by value
    public void deleteByValue(int value) {
        if (head == null) return;
        Node temp = head;
        do {
            if (temp.data == value) {
                if (temp == head) {
                    deleteFromBeginning();
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("Value not found.");
    }

    // Update value at position
    public void updateAtPosition(int pos, int newValue) {
        if (head == null) return;
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
            if (temp == head) {
                System.out.println("Position out of range.");
                return;
            }
        }
        temp.data = newValue;
    }

    // Search by value
    public int searchByValue(int value) {
        if (head == null) return -1;
        Node temp = head;
        int pos = 1;
        do {
            if (temp.data == value) return pos;
            temp = temp.next;
            pos++;
        } while (temp != head);
        return -1;
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Display backward
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node tail = head.prev;
        Node temp = tail;
        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println();
    }

    // Reverse display (recursive helper)
    private void reverseDisplayRec(Node node, Node head) {
        if (node.prev == head.prev) {
            System.out.print(node.data + " ");
            return;
        }
        reverseDisplayRec(node.next, head);
        System.out.print(node.data + " ");
    }

    public void reverseDisplay() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        reverseDisplayRec(head, head);
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);
        list.insertAtPosition(15, 3);

        System.out.print("Forward List: ");
        list.displayForward();

        System.out.print("Backward List: ");
        list.displayBackward();

        list.deleteFromBeginning();
        System.out.print("After deleting beginning: ");
        list.displayForward();

        list.deleteFromEnd();
        System.out.print("After deleting end: ");
        list.displayForward();

        list.deleteAtPosition(2);
        System.out.print("After deleting at pos 2: ");
        list.displayForward();

        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.deleteByValue(40);
        System.out.print("After deleting value 40: ");
        list.displayForward();

        list.updateAtPosition(2, 99);
        System.out.print("After updating position 2 with 99: ");
        list.displayForward();

        int searchPos = list.searchByValue(99);
        System.out.println("99 found at position: " + searchPos);

        System.out.print("Reverse display: ");
        list.reverseDisplay();
    }
}

/*
Forward List: 5 10 15 20 30
Backward List: 30 20 15 10 5
After deleting beginning: 10 15 20 30
After deleting end: 10 15 20
After deleting at pos 2: 10 20
After deleting value 40: 10 20 50
After updating position 2 with 99: 10 99 50
99 found at position: 2
Reverse display: 10


Step-by-Step Execution
Step 1: insertAtEnd(10)

List = 10 (head = tail = 10, points circularly to itself)

Step 2: insertAtEnd(20)

List = 10 ⇄ 20 (10.next = 20, 20.next = 10; doubly linked)

Step 3: insertAtEnd(30)

List = 10 ⇄ 20 ⇄ 30 (30 points back to 10, circular)

Step 4: insertAtBeginning(5)

New node 5 inserted at front

List = 5 ⇄ 10 ⇄ 20 ⇄ 30

Step 5: insertAtPosition(15, 3)

Position 3 → Insert after 10

List = 5 ⇄ 10 ⇄ 15 ⇄ 20 ⇄ 30

👉 Display: 5 10 15 20 30

Step 6: deleteFromBeginning()

Remove 5

List = 10 ⇄ 15 ⇄ 20 ⇄ 30

👉 Display: 10 15 20 30

Step 7: deleteFromEnd()

Remove 30

List = 10 ⇄ 15 ⇄ 20

👉 Display: 10 15 20

Step 8: deleteAtPosition(2)

Position 2 → Remove 15

List = 10 ⇄ 20

👉 Display: 10 20

Step 9: insertAtEnd(40)

List = 10 ⇄ 20 ⇄ 40

Step 10: insertAtEnd(50)

List = 10 ⇄ 20 ⇄ 40 ⇄ 50

Step 11: deleteByValue(40)

Remove node with value 40

List = 10 ⇄ 20 ⇄ 50

👉 Display: 10 20 50

Step 12: updateAtPosition(2, 99)

Position 2 → update 20 → 99

List = 10 ⇄ 99 ⇄ 50

👉 Display: 10 99 50

Step 13: searchByValue(99)

Traverse list → found at position 2
👉 Output: 99 found at position: 2

Step 14: reverseDisplay()

Traverse backwards (circular doubly allows reverse easily)
👉 Output: 50 99 10
 */