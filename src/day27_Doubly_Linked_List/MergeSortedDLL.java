package day27_Doubly_Linked_List;

// merge two sorted doubly linked lists (DLLs) into a single sorted DLL in Java

class Node11 {
    int data;
    Node11 prev;
    Node11 next;

    Node11(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class MergeSortedDLL {
    // Merge two sorted DLLs
    public static Node11 mergeSortedDLLs(Node11 head1, Node11 head2) {
        // Dummy node to ease the process
        Node11 dummy = new Node11(0);
        Node11 tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1.prev = tail;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2.prev = tail;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // Append the remaining nodes
        if (head1 != null) {
            tail.next = head1;
            head1.prev = tail;
        }
        if (head2 != null) {
            tail.next = head2;
            head2.prev = tail;
        }

        // Return the real head
        Node11 mergedHead = dummy.next;
        if (mergedHead != null)
            mergedHead.prev = null;

        return mergedHead;
    }

    // Print a DLL
    public static void printDLL(Node11 head) {
        System.out.print("DLL: ");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Helper to create a DLL from array
    public static Node11 createDLLFromArray(int[] arr) {
        Node11 head = null, tail = null;
        for (int data : arr) {
            Node11 newNode = new Node11(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        return head;
    }

    // Main
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        Node11 head1 = createDLLFromArray(arr1);
        Node11 head2 = createDLLFromArray(arr2);

        System.out.println("List 1:");
        printDLL(head1);

        System.out.println("List 2:");
        printDLL(head2);

        Node11 mergedHead = mergeSortedDLLs(head1, head2);

        System.out.println("Merged Sorted DLL:");
        printDLL(mergedHead);
    }
}
