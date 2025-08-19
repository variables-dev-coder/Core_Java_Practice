package day26_Singly_LinkedList;


class Node13 {
    int data;
    Node13 next;

    Node13(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList13 {
    private Node13 head;

    // Insert at Beginning
    public void insertAtBeginning(int data) {
        Node13 newNode = new Node13(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node13 newNode = new Node13(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node13 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at Position
    public void insertAtPosition(int pos, int data) {
        if (pos < 1) {
            System.out.println("Invalid Position!");
            return;
        }
        Node13 newNode = new Node13(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node13 temp = head;
        for (int i = 1; i < pos -1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete from Beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    // Delete from End
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node13 temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete at position
    public void deleteAtPosition(int pos) {
        if (head == null || pos < 1) {
            System.out.println("Invalid position or List is empty!");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node13 temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of range!");
            return;
        }
        temp.next = temp.next.next;
    }

    // Update at position
    public void updateAtPosition(int pos, int data) {
        if (head == null || pos < 1) {
            System.out.println("Invalid position or List is empty!");
            return;
        }
        Node13 temp = head;
        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        temp.data = data;
    }

    // Search by value
    public int searchByValue(int value) {
        Node13 temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == value) return pos;
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    // Delete by value
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node13 temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Value not found!");
        } else {
            temp.next = temp.next.next;
        }
    }

    // Display
    public void display() {
        Node13 temp = head;
        while (temp != null) {
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList13 list = new SinglyLinkedList13();

        System.out.println("Insert at Beginning and End");
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.display();

        System.out.println("\nInsert at Position 2 (15):");
        list.insertAtPosition(2, 15);
        list.display();

        System.out.println("\nDelete from Beginning:");
        list.deleteFromBeginning();
        list.display();

        System.out.println("\nDelete from End:");
        list.deleteFromEnd();
        list.display();

        System.out.println("\nDelete at Position 2:");
        list.deleteAtPosition(2);
        list.display();

        System.out.println("\nUpdate at Position 2 (100):");
        list.updateAtPosition(2, 100);
        list.display();

        System.out.println("\nSearch for Value 100:");
        int pos = list.searchByValue(100);
        if (pos != -1)
            System.out.println("Found at position: " + pos);
        else
            System.out.println("Not found!");

        System.out.println("\nDelete by Value (100):");
        list.deleteByValue(100);
        list.display();
    }
}

/*
10 ->
20 ->
30 ->
40 ->
50 ->
null

Insert at Position 2 (15):
10 ->
15 ->
20 ->
30 ->
40 ->
50 ->
null

Delete from Beginning:
15 ->
20 ->
30 ->
40 ->
50 ->
null

Delete from End:
15 ->
20 ->
30 ->
40 ->
null

Delete at Position 2:
15 ->
30 ->
40 ->
null

Update at Position 2 (100):
15 ->
100 ->
40 ->
null

Search for Value 100:
Found at position: 2

Delete by Value (100):
15 ->
40 ->
null

 */