package day27_Doubly_Linked_List;


class DoublyNode19 {
    int data;
    DoublyNode19 prev;
    DoublyNode19 next;

    DoublyNode19(int data) {
        this.data = data;
    }
}

public class RemoveDuplicatesSortedDLL {
    DoublyNode19 head;

    // Add node at end
    public void addLast(int data) {
        DoublyNode19 newNode = new DoublyNode19(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode19 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Print DLL
    public void printList() {
        DoublyNode19 temp = head;
        System.out.print("DLL: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // ✅ Remove Duplicates from Sorted DLL
    public void removeDuplicatesSorted() {
        if (head == null || head.next == null) return;

        DoublyNode19 curr = head;

        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                // Remove curr.next
                DoublyNode19 duplicate = curr.next;
                curr.next = duplicate.next;

                if (duplicate.next != null) {
                    duplicate.next.prev = curr;
                }

                duplicate.next = null;
                duplicate.prev = null;
            } else {
                curr = curr.next;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        RemoveDuplicatesSortedDLL dll = new RemoveDuplicatesSortedDLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(3);
        dll.addLast(4);

        System.out.println("Before removing duplicates:");
        dll.printList();

        dll.removeDuplicatesSorted();

        System.out.println("After removing duplicates:");
        dll.printList();
    }
}
