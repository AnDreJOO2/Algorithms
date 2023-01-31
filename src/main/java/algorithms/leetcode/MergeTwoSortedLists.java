package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/reverse-linked-list/">https://leetcode.com/problems/reverse-linked-list/</a>
 * @date 01.02.2023
 */
public class MergeTwoSortedLists {

    public class ListNode {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp = new ListNode();
        ListNode current = temp;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;
            list1 = list1.next;
        }
        if (list2 != null) {
            current.next = list2;
            list2 = list2.next;
        }
        return temp.next;
    }

}
//list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
