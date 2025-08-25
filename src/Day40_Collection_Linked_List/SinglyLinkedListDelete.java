package Day40_Collection_Linked_List;


class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedListDelete {
    Node2 head;

    // Insert at tail for setup
    public void insertAtTail(int data) {
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 1. Delete from Head
    public void deleteHead() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    // 2. Delete from Tail
    public void deleteTail() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node2 temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // 3. Delete by Value
    public void deleteByValue(int value) {
        if (head == null) return;
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node2 temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // 4. Delete by Position (0-based index)
    public void deleteByPosition(int position) {
        if (head == null) return;
        if (position == 0) {
            head = head.next;
            return;
        }
        Node2 temp = head;
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Traverse
    public void printList() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedListDelete list = new SinglyLinkedListDelete();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);

        System.out.print("Original List: ");
        list.printList();

        list.deleteHead();
        System.out.print("After deleteHead: ");
        list.printList();

        list.deleteTail();
        System.out.print("After deleteTail: ");
        list.printList();

        list.deleteByValue(30);
        System.out.print("After deleteByValue(30): ");
        list.printList();

        list.deleteByPosition(0);
        System.out.print("After deleteByPosition(0): ");
        list.printList();
    }
}

/*
Original List: 10 -> 20 -> 30 -> 40 -> 50 -> null
After deleteHead: 20 -> 30 -> 40 -> 50 -> null
After deleteTail: 20 -> 30 -> 40 -> null
After deleteByValue(30): 20 -> 40 -> null
After deleteByPosition(0): 40 -> null


Dry Run

Input List: 10 -> 20 -> 30 -> 40 -> 50
deleteHead() → removes 10 → 20 -> 30 -> 40 -> 50
deleteTail() → removes 50 → 20 -> 30 -> 40
deleteByValue(30) → removes 30 → 20 -> 40
deleteByPosition(0) → removes 20 → 40


 */