package day26_Singly_LinkedList;


// Remove the Nth node from the end of a singly linked list.

class Node12 {
    int data;
    Node12 next;

    Node12(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList12 {
    Node12 head;

    // Add node at end
    public void add(int data) {
        Node12 newNode = new Node12(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node12 curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Remove nth node from end (two pointer)
    public void removeNthFromEnd(int n) {
        Node12 dummy = new Node12(0);
        dummy.next = head;

        Node12 fast = dummy;
        Node12 slow = dummy;

        // Step 1: Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (fast == null) {
                System.out.println("List has fewer than " + n + " nodes.");
                return;
            }
            fast = fast.next;
        }

        // Step 2: Move both until fast reaches end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Step 3: Delete the nth node from end
        slow.next = slow.next.next;

        // Step 4: Update head in case first node was deleted
        head = dummy.next;
    }

    public void printList() {
        Node12 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

public class RemoveNthFromEndMain {
    public static void main(String[] args) {
        LinkedList12 list = new LinkedList12();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List:");
        list.printList(); // 10 -> 20 -> 30 -> 40 -> 50 -> null

        int n = 2;
        list.removeNthFromEnd(n);

        System.out.println("\nAfter removing " + n + "th node from end:");
        list.printList(); // 10 -> 20 -> 30 -> 50 -> null
    }
}
