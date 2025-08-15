package day23_PriorityQueue_Heap;


import java.util.PriorityQueue;

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int x) {
        val = x;
    }
}

public class MergeKSortedLists2 {

    public static ListNode2 mergeKLists(ListNode2[] lists) {

        // Min Heap storing list nodes by value
        PriorityQueue<ListNode2> minHeap = new PriorityQueue<>(
                (a, b) -> a.val - b.val
        );

        // Add first node of each list to heap
        for (ListNode2 node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        // Dummy head for result list
        ListNode2 dummy = new ListNode2(0);
        ListNode2 tail = dummy;

        // Process heap
        while (!minHeap.isEmpty()) {
            ListNode2 smallest = minHeap.poll();
            tail.next = smallest;
            tail = tail.next;

            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Create example lists
        ListNode2 l1 = new ListNode2(1);
        l1.next = new ListNode2(4);
        l1.next.next = new ListNode2(5);

        ListNode2 l2 = new ListNode2(1);
        l2.next = new ListNode2(3);
        l2.next.next = new ListNode2(4);

        ListNode2 l3 = new ListNode2(2);
        l3.next = new ListNode2(6);

        ListNode2[] lists = {l1, l2, l3};

        ListNode2 merged = mergeKLists(lists);

        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }

}

/*
Problem:
You are given k linked lists, each sorted in ascending order.
Merge all the lists into one sorted linked list and return it.

Ex
Input:
list1 = 1 -> 4 -> 5
list2 = 1 -> 3 -> 4
list3 = 2 -> 6

Output:
1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6


Approach (Min Heap)

Use a min heap to store the current head of each list.
Extract the smallest node, append it to the merged list, and push its next node into the heap.
Repeat until heap is empty.


Dry Run

Heap initially = [1(l1), 1(l2), 2(l3)]
Pop 1(l1) → push 4(l1)
Pop 1(l2) → push 3(l2)
Pop 2(l3) → push 6(l3)
Continue until heap empty.

Time complexity: O(N log k), where N is total nodes, k is number of lists.

 */