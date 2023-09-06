package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/linked-list-cycle/">https://leetcode.com/problems/linked-list-cycle/</a>
 * @date 06.09.2023
 */
public class LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
