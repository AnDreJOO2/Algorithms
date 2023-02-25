package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/remove-linked-list-elements/">https://leetcode.com/problems/remove-linked-list-elements/</a>
 * @date 25.02.2023
 */
public class RemoveLinkedListElements {

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

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode tempNode = head;
        while (tempNode != null && tempNode.next != null) {
            if (tempNode.next.val == val) {
                tempNode.next = tempNode.next.next;
            } else {
                tempNode = tempNode.next;
            }
        }
        return tempNode;
    }

}
