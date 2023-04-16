package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/middle-of-the-linked-list/">https://leetcode.com/problems/middle-of-the-linked-list/</a>
 * @date 16.04.2023
 */
public class MiddleOfTheLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }
}
