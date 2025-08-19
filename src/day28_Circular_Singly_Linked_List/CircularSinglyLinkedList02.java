package day28_Circular_Singly_Linked_List;

// Circular Singly Linked List Example
public class CircularSinglyLinkedList02 {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // Insert at position
    public void insertAtPosition(int data, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        Node newNode = new Node(data);
        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete from beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
    }

    // Delete from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head;
        Node prev = null;
        while (temp.next != head) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = head;
    }

    // Delete at position
    public void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (pos == 1) {
            deleteFromBeginning();
            return;
        }
        Node temp = head;
        Node prev = null;
        for (int i = 1; i < pos && temp.next != head; i++) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == head) {
            System.out.println("Invalid position!");
            return;
        }
        prev.next = temp.next;
    }

    // Delete by value
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.data == value) {
            deleteFromBeginning();
            return;
        }
        Node temp = head;
        Node prev = null;
        do {
            prev = temp;
            temp = temp.next;
            if (temp.data == value) {
                prev.next = temp.next;
                return;
            }
        } while (temp != head);
        System.out.println("Value not found!");
    }

    // Update at position
    public void updateAtPosition(int pos, int data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos && temp.next != head; i++) {
            temp = temp.next;
        }
        temp.data = data;
    }

    // Search by value
    public int searchByValue(int value) {
        if (head == null) {
            return -1;
        }
        Node temp = head;
        int pos = 1;
        do {
            if (temp.data == value) {
                return pos;
            }
            temp = temp.next;
            pos++;
        } while (temp != head);
        return -1;
    }

    // Display
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Reverse display
    public void reverseDisplay() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        reverseDisplayRecursive(head, head);
        System.out.println();
    }

    private void reverseDisplayRecursive(Node current, Node start) {
        if (current.next != start) {
            reverseDisplayRecursive(current.next, start);
        }
        System.out.print(current.data + " ");
    }

    // Main method example usage
    public static void main(String[] args) {
        CircularSinglyLinkedList02 list = new CircularSinglyLinkedList02();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);
        list.insertAtPosition(15, 3);

        System.out.print("List: ");
        list.display();

        list.deleteFromBeginning();
        System.out.print("After deleting beginning: ");
        list.display();

        list.deleteFromEnd();
        System.out.print("After deleting end: ");
        list.display();

        list.deleteAtPosition(2);
        System.out.print("After deleting at pos 2: ");
        list.display();

        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.deleteByValue(40);
        System.out.print("After deleting value 40: ");
        list.display();

        list.updateAtPosition(2, 99);
        System.out.print("After updating position 2 with 99: ");
        list.display();

        int searchPos = list.searchByValue(99);
        System.out.println("99 found at position: " + searchPos);

        System.out.print("Reverse display: ");
        list.reverseDisplay();
    }
}

/*
List: 5 10 15 20 30
After deleting beginning: 10 15 20 30
After deleting end: 10 15 20
After deleting at pos 2: 10 20
After deleting value 40: 10 20 50
After updating position 2 with 99: 10 99 50
99 found at position: 2
Reverse display: 50 99 10


1. Create List
CircularSinglyLinkedList02 list = new CircularSinglyLinkedList02();


👉 List is empty (head = null).

2. Insert at End
list.insertAtEnd(10);


👉 List: 10 → (back to 10)

list.insertAtEnd(20);


👉 List: 10 → 20 → (back to 10)

list.insertAtEnd(30);


👉 List: 10 → 20 → 30 → (back to 10)

3. Insert at Beginning
list.insertAtBeginning(5);


👉 List: 5 → 10 → 20 → 30 → (back to 5)

4. Insert at Position
list.insertAtPosition(15, 3);


Insert 15 at position 3 (after 2nd node).
👉 List: 5 → 10 → 15 → 20 → 30 → (back to 5)

5. Display
list.display();


✅ Output: 5 10 15 20 30

6. Delete from Beginning
list.deleteFromBeginning();


Removes 5.
👉 List: 10 → 15 → 20 → 30 → (back to 10)

✅ Output: 10 15 20 30

7. Delete from End
list.deleteFromEnd();


Removes 30.
👉 List: 10 → 15 → 20 → (back to 10)

✅ Output: 10 15 20

8. Delete at Position
list.deleteAtPosition(2);


Removes node at pos 2 (15).
👉 List: 10 → 20 → (back to 10)

✅ Output: 10 20

9. Insert at End
list.insertAtEnd(40);
list.insertAtEnd(50);


👉 List: 10 → 20 → 40 → 50 → (back to 10)

10. Delete by Value
list.deleteByValue(40);


Removes 40.
👉 List: 10 → 20 → 50 → (back to 10)

✅ Output: 10 20 50

11. Update at Position
list.updateAtPosition(2, 99);


Update node at position 2 → 20 becomes 99.
👉 List: 10 → 99 → 50 → (back to 10)

✅ Output: 10 99 50

12. Search by Value
list.searchByValue(99);


99 is found at position 2.
✅ Output: 99 found at position: 2

13. Reverse Display
list.reverseDisplay();


👉 Prints list in reverse order using recursion.

✅ Output: 50 99 10

✅ Final Outputs (step by step)
List: 5 10 15 20 30
After deleting beginning: 10 15 20 30
After deleting end: 10 15 20
After deleting at pos 2: 10 20
After deleting value 40: 10 20 50
After updating position 2 with 99: 10 99 50
99 found at position: 2
Reverse display: 50 99 10

 */