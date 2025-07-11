package day16_PriorityQueue_Heap;


import java.util.List;
import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class MergeKSortedLists {

    public static ListNode mergeKList(ListNode[] list) {
        // Min - Heap based on node value
        PriorityQueue<ListNode>  minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the head of each list
        for (ListNode head : list) {
            if (head != null)
                minHeap.offer(head);
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!minHeap.isEmpty()) {
            ListNode curr = minHeap.poll();   // smallest node
            tail.next = curr;
            tail = tail.next;

            if (curr.next != null)
                minHeap.offer(curr.next);   // insert next node
        }
        return dummy.next;
    }

    // Helper to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.println(head.val + " -> ");
            head = head.next;
        }
        System.out.println("Null");
    }

    // Test Driver
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];

        // [1->4->5]
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);


        // [1->3->4]
        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);

        // [2->6]
        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        ListNode result = mergeKList(lists);
        printList(result); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6 -> null


    }

}
