package day27_Doubly_Linked_List;


// Sort a Doubly Linked List
// use merge sort

class DoublyNode18 {
    int data;
    DoublyNode18 prev;
    DoublyNode18 next;

    DoublyNode18(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLL_Sort {
    DoublyNode18 head;

    // Insert at end
    public void insertAtEnd(int data) {
        DoublyNode18 newNode = new DoublyNode18(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode18 temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Print list
    public void printDLL() {
        DoublyNode18 temp = head;
        System.out.print("DLL: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Sort the DLL
    public void sortDLL() {
        head = mergeSort(head);
    }

    private DoublyNode18 mergeSort(DoublyNode18 node) {
        if (node == null || node.next == null)
            return node;

        DoublyNode18 middle = getMiddle(node);
        DoublyNode18 nextToMiddle = middle.next;
        middle.next = null;
        if (nextToMiddle != null)
            nextToMiddle.prev = null;

        DoublyNode18 left = mergeSort(node);
        DoublyNode18 right = mergeSort(nextToMiddle);

        return merge(left, right);
    }

    private DoublyNode18 merge(DoublyNode18 first, DoublyNode18 second) {
        if (first == null) return second;
        if (second == null) return first;

        if (first.data <= second.data) {
            first.next = merge(first.next, second);
            if (first.next != null) first.next.prev = first;
            first.prev = null;
            return first;
        } else {
            second.next = merge(first, second.next);
            if (second.next != null) second.next.prev = second;
            second.prev = null;
            return second;
        }
    }

    // Get middle using slow-fast pointer
    private DoublyNode18 getMiddle(DoublyNode18 node) {
        if (node == null)
            return node;

        DoublyNode18 slow = node, fast = node;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        DLL_Sort list = new DLL_Sort();
        list.insertAtEnd(40);
        list.insertAtEnd(10);
        list.insertAtEnd(30);
        list.insertAtEnd(20);

        System.out.println("Original:");
        list.printDLL();

        list.sortDLL();

        System.out.println("Sorted DLL:");
        list.printDLL();
    }
}
