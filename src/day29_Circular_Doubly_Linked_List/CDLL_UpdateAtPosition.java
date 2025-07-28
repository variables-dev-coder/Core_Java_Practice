package day29_Circular_Doubly_Linked_List;

// CDLL_Update At Position

class CDLLNode6 {
    int data;
    CDLLNode6 prev;
    CDLLNode6 next;

    CDLLNode6(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}


public class CDLL_UpdateAtPosition {

    CDLLNode6 head = null;

    // Insert at End (for testing)
    public void insertEnd(int data) {
        CDLLNode6 newNode = new CDLLNode6(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        CDLLNode6 tail = head.prev;

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    // Update value at given position (1-based index)
    public void updateAtPosition(int position, int newValue) {
        if (head == null) {
            System.out.println("CDLL is empty.");
            return;
        }

        CDLLNode6 current = head;
        int count = 1;

        do {
            if (count == position) {
                current.data = newValue;
                return;
            }
            current = current.next;
            count++;
        } while (current != head);

        System.out.println("Invalid position: " + position);
    }

    // Display CDLL
    public void display() {
        if (head == null) {
            System.out.println("CDLL is empty.");
            return;
        }

        CDLLNode6 temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CDLL_UpdateAtPosition list = new CDLL_UpdateAtPosition();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);

        System.out.println("Before update:");
        list.display();  // 10 20 30 40

        list.updateAtPosition(3, 99);  // Update 3rd node to 99

        System.out.println("After update:");
        list.display();  // 10 20 99 40
    }
}


/*


Logic
Traverses to the given position.
Updates the node’s data with the new value.
Handles edge cases like empty list and invalid position.

 */