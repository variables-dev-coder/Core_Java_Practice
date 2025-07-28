package day29_Circular_Doubly_Linked_List;



// CDLL_Delete By Value

class CDLLNode8 {
    int data;
    CDLLNode8 prev;
    CDLLNode8 next;

    CDLLNode8(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

public class CDLL_DeleteByValue {

    CDLLNode8 head = null;

    // Insert at End (for testing)
    public void insertEnd(int data) {
        CDLLNode8 newNode = new CDLLNode8(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        CDLLNode8 tail = head.prev;

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    // Delete by Value
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("CDLL is empty.");
            return;
        }

        CDLLNode8 current = head;
        boolean found = false;

        // Special case: head node is the only node and holds the value
        if (head.data == value && head.next == head) {
            head = null;
            System.out.println("Deleted the only node with value " + value);
            return;
        }

        do {
            if (current.data == value) {
                found = true;

                // If deleting head
                if (current == head) {
                    head = head.next;
                }

                // Remove current node
                current.prev.next = current.next;
                current.next.prev = current.prev;

                System.out.println("Deleted node with value " + value);
                return;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("Value " + value + " not found in the list.");
        }
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("CDLL is empty.");
            return;
        }

        CDLLNode8 temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CDLL_DeleteByValue list = new CDLL_DeleteByValue();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);

        System.out.println("Original CDLL:");
        list.display();

        list.deleteByValue(30); // Delete from middle
        list.display();

        list.deleteByValue(10); // Delete head
        list.display();

        list.deleteByValue(100); // Not found
        list.display();
    }
}
