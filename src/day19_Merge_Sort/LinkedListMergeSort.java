package day19_Merge_Sort;


/*
Step-by-Step Plan:
Find Middle Node (using slow & fast pointer)
Divide List into two halves
Recursively sort left and right halves
Merge the two sorted halves
 */

class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int val) {
        this.val = val;
    }
}

public class LinkedListMergeSort {

    public static void main(String[] args) {
        // Creating Linked List: 4 -> 2 -> 1 -> 3
        ListNode3 head = new ListNode3(4);
        head.next = new ListNode3(2);
        head.next.next = new ListNode3(1);
        head.next.next.next = new ListNode3(3);

        System.out.println("Original List:");
        printList(head);

        head = mergeSort(head);

        System.out.println("Sorted List:");
        printList(head);
    }

    // Merge Sort Function
    public static ListNode3 mergeSort(ListNode3 head) {
        if (head == null || head.next == null) return head;

        // Step 1: Find middle and split
        ListNode3 mid = getMiddle(head);
        ListNode3 rightHead = mid.next;
        mid.next = null; // Split the list into two halves

        // Step 2: Sort left and right halves
        ListNode3 left = mergeSort(head);
        ListNode3 right = mergeSort(rightHead);

        // Step 3: Merge sorted halves
        return merge(left, right);
    }

    // Find middle node using slow & fast pointers
    private static ListNode3 getMiddle(ListNode3 head) {
        ListNode3 slow = head;
        ListNode3 fast = head.next; // Start fast at second node

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted lists
    private static ListNode3 merge(ListNode3 l1, ListNode3 l2) {
        ListNode3 dummy = new ListNode3(-1);
        ListNode3 temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        // Append the remaining nodes
        if (l1 != null) temp.next = l1;
        if (l2 != null) temp.next = l2;

        return dummy.next;
    }

    // Utility to print list
    public static void printList(ListNode3 head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}

/*
Original List:
4 -> 2 -> 1 -> 3 -> null
Sorted List:
1 -> 2 -> 3 -> 4 -> null
 */