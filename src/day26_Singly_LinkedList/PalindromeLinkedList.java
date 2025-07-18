package day26_Singly_LinkedList;


class PalinListNode {
    int val;
    PalinListNode next;

    PalinListNode(int val) {
        this.val = val;
    }
}

public class PalindromeLinkedList {

    // Step 1 + 2 : Check palindrome
    public static boolean isPalindrome(PalinListNode head) {
        if (head == null || head.next == null)
            return true;

        // Find middle (slow will be at middle)
        PalinListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next;
        }

        // reverse second half
        PalinListNode secondHalf = reverse(slow);

        // Compare both halve
        PalinListNode firstHalf = head;
        PalinListNode temp = secondHalf;
        while (temp != null) {
            if (firstHalf.val != temp.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }
        return true;
    }

    // Reverse a linked list (utility)
    public static PalinListNode reverse(PalinListNode head) {
        PalinListNode prev = null, curr = head;
        while (curr != null) {
            PalinListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    // Print linked list
    public static void printList(PalinListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create test linked list: 1 -> 2 -> 3 -> 2 -> 1

        PalinListNode head = new PalinListNode(1);
        head.next = new PalinListNode(2);
        head.next.next = new PalinListNode(3);
        head.next.next.next = new PalinListNode(2);
        head.next.next.next.next = new PalinListNode(1);

        System.out.print("Input Linked List: ");
        printList(head);

        boolean result = isPalindrome(head);
        System.out.println("Is Palindrome? " + result);
    }

}
