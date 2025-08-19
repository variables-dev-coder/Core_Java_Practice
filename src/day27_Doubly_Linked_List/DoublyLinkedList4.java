package day27_Doubly_Linked_List;


class Node12 {
    int data;
    Node12 prev;
    Node12 next;

    Node12(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DoublyLinkedList4 {
    private Node12 head;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node12 newNode = new Node12(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node12 newNode = new Node12(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node12 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at position
    public void insertAtPosition(int data, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }
        Node12 newNode = new Node12(data);
        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }
        Node12 temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete from beginning
    public void deleteFromBeginning() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Delete from end
    public void deleteFromEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node12 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    // Delete at position
    public void deleteAtPosition(int pos) {
        if (head == null || pos <= 0) return;
        if (pos == 1) {
            deleteFromBeginning();
            return;
        }
        Node12 temp = head;
        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
    }

    // Delete by value
    public void deleteByValue(int value) {
        Node12 temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    // Update value at position
    public void updateAtPosition(int pos, int newValue) {
        Node12 temp = head;
        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) temp.data = newValue;
    }

    // Search by value
    public int searchByValue(int value) {
        Node12 temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == value) return pos;
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    // Display forward
    public void display() {
        Node12 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display reverse
    public void reverseDisplay() {
        if (head == null) return;
        Node12 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Main method for demo
    public static void main(String[] args) {
        DoublyLinkedList4 list = new DoublyLinkedList4();

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


🔹 Dry Run Step by Step

insertAtEnd(10)
List: 10

insertAtEnd(20)
List: 10 <-> 20

insertAtEnd(30)
List: 10 <-> 20 <-> 30

insertAtBeginning(5)
List: 5 <-> 10 <-> 20 <-> 30

insertAtPosition(15, 3)
Insert 15 at 3rd position (after 10).
List: 5 <-> 10 <-> 15 <-> 20 <-> 30
✅ Display → 5 10 15 20 30

deleteFromBeginning()
Delete first node (5).
List: 10 <-> 15 <-> 20 <-> 30
✅ Display → 10 15 20 30

deleteFromEnd()
Delete last node (30).
List: 10 <-> 15 <-> 20
✅ Display → 10 15 20

deleteAtPosition(2)
Delete node at position 2 (15).
List: 10 <-> 20
✅ Display → 10 20

insertAtEnd(40)
List: 10 <-> 20 <-> 40

insertAtEnd(50)
List: 10 <-> 20 <-> 40 <-> 50

deleteByValue(40)
Remove node with value 40.
List: 10 <-> 20 <-> 50
✅ Display → 10 20 50

updateAtPosition(2, 99)
Update node at position 2 (20 → 99).
List: 10 <-> 99 <-> 50
✅ Display → 10 99 50

searchByValue(99)
Found at position 2.
✅ Output → 99 found at position: 2

reverseDisplay()
Print list backwards.
✅ Output → 50 99 10

 */