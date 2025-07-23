package day27_Doubly_Linked_List;


// Search a Value in DLL

// Search if a given value exists in the list and return its position (0-based index).
//If not found, return -1.

class DoublyNode12 {
    int data;
    DoublyNode12 prev, next;

    DoublyNode12(int data) {
        this.data = data;
    }
}
public class DLL_SearchValue {

    DoublyNode12 head;

    // Insert at end
    public void insertAtEnd(int data) {
        DoublyNode12 newNode = new DoublyNode12(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode12 temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Search a value
    public int search(int value) {
        DoublyNode12 temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == value) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;  // Not found
    }

    // Print list
    public void printList() {
        DoublyNode12 temp = head;
        System.out.print("DLL: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL_SearchValue list = new DLL_SearchValue();

        list.insertAtEnd(5);
        list.insertAtEnd(15);
        list.insertAtEnd(25);
        list.insertAtEnd(35);
        list.insertAtEnd(45);

        list.printList();  // DLL: 5 15 25 35 45

        int target = 25;
        int pos = list.search(target);

        if (pos != -1)
            System.out.println("Value " + target + " found at index: " + pos);
        else
            System.out.println("Value " + target + " not found.");

        target = 100;
        pos = list.search(target);
        System.out.println("Search result for 100: " + (pos != -1 ? "Found at index " + pos : "Not found"));
    }
}
