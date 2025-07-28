package day29_Circular_Doubly_Linked_List;


// CDLL search by value


class CDLLNode7 {
    int data;
    CDLLNode7 prev;
    CDLLNode7 next;

    CDLLNode7(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class CDLL_SearchByValue {

    CDLLNode7 head = null;

    // Insert at End (for testing)
    public void insertEnd(int data) {
        CDLLNode7 newNode = new CDLLNode7(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        CDLLNode7 tail = head.prev;

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    // Search by Value
    public void searchByValue(int target) {
        if (head == null) {
            System.out.println("CDLL is empty.");
            return;
        }

        CDLLNode7 current = head;
        int position = 1;

        do {
            if (current.data == target) {
                System.out.println("Value " + target + " found at position " + position);
                return;
            }
            current = current.next;
            position++;
        } while (current != head);

        System.out.println("Value " + target + " not found in the list.");
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("CDLL is empty.");
            return;
        }

        CDLLNode7 temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CDLL_SearchByValue list = new CDLL_SearchByValue();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);

        System.out.println("CDLL Elements:");
        list.display();

        list.searchByValue(30);  // Found
        list.searchByValue(50);  // Not found
    }

}


/*

logic
Traverses the circular DLL.
Compares each node's data with the target.
Stops and returns position when found.
Ends with a message if not found.

 */