package day26_Singly_LinkedList;


// Reverse a Linked List (Recursive)


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedListRecursive {

    // Recursive reverse method
    public static ListNode reverseList(ListNode  head) {
        if (head == null || head.next == null)
            return head;

        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // helper method to print
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
    }

    // main method
    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("original Linked List:");
        printList(head);

        // Reversing the list recursively
        ListNode reversedHead = reverseList(head);

        System.out.println("reversed Linked List:");
        printList(reversedHead);
    }

}
