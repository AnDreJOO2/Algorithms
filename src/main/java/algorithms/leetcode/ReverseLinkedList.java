package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/reverse-linked-list/">https://leetcode.com/problems/reverse-linked-list/</a>
 * @date 30.01.2023
 */
public class  ReverseLinkedList {
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

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;

    }
}

//Example:
/*
1st iteration
previous=null
head =1
next = 2
head.next = null
previous = 1
head = 2

2nd iteration
head=2
next = 3
head.next = 1
previous = 2
head = 3

...
*/

















