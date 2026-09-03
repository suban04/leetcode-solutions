/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        // Empty list, single node, or no rotation
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find size and tail
        ListNode curr = head;
        ListNode tail = null;
        int size = 0;

        while (curr != null) {
            tail = curr;
            curr = curr.next;
            size++;
        }

        // Reduce unnecessary rotations
        k = k % size;

        if (k == 0) {
            return head;
        }

        // Find new tail
        int diff = size - k;
        curr = head;

        for (int i = 1; i < diff; i++) {
            curr = curr.next;
        }

        // New head
        ListNode newHead = curr.next;

        // Rotate
        curr.next = null;
        tail.next = head;

        return newHead;
    }
}