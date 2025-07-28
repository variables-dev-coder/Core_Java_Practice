package day29_Circular_Doubly_Linked_List;

// Delete from Specific Position in CDLL

class CDLLNode5 {
    int data;
    CDLLNode5 prev;
    CDLLNode5 next;

    CDLLNode5(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


public class CDLL_DeletePosition {

    CDLLNode5 head = null;

    // Insert at front
    public void insertFront(int data) {
        CDLLNode5 newNode = new CDLLNode5(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }

        CDLLNode5 tail = head.prev;

        newNode.next = head;
        newNode.prev = tail;

        tail.next = newNode;
        head.prev = newNode;

        head = newNode;
    }

    // Delete from specific position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        int len = 1;
        CDLLNode5 temp = head.next;
        while (temp != head) {
            len++;
            temp = temp.next;
        }

        if (position < 1 || position > len) {
            System.out.println("Invalid position.");
            return;
        }

        // Delete first node
        if (position == 1) {
            if (head.next == head) {
                head = null;
                return;
            }
            CDLLNode5 tail = head.prev;
            head = head.next;
            head.prev = tail;
            tail.next = head;
            return;
        }

        CDLLNode5 current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }

        CDLLNode5 prevNode = current.prev;
        CDLLNode5 nextNode = current.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        // If deleted node was the last node (tail)
        if (current == head.prev) {
            head.prev = prevNode;
        }
    }

    // Display
    public void display() {
        if (head == null) {
            System.out.println("CDLL is empty");
            return;
        }

        CDLLNode5 temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CDLL_DeletePosition list = new CDLL_DeletePosition();

        list.insertFront(40);
        list.insertFront(30);
        list.insertFront(20);
        list.insertFront(10);
        list.display();  // 10 20 30 40

        list.deleteAtPosition(1); // Delete 10
        list.display();           // 20 30 40

        list.deleteAtPosition(3); // Delete 40
        list.display();           // 20 30

        list.deleteAtPosition(2); // Delete 30
        list.display();           // 20

        list.deleteAtPosition(1); // Delete 20
        list.display();           // CDLL is empty
    }
}


/*


 Logic
-Validate the position.
-If it's the head (position 1), update head.
-Traverse to the position, and rewire prev and next.
-Handle edge cases like last node and only one node.
 */