package algorithms.leetcode;


/**
 * @link <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/">https://leetcode.com/problems/remove-duplicates-from-sorted-list/</a>
 * @date 25.01.2023
 */
public class RemoveDuplicatesFromSortedList {

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

    public ListNode deleteDuplicates(ListNode head) {

        // if null return null
        if(head == null){
            return null;
        }

        //temporary ListNode to work on
        ListNode temp = head;

        while(temp.next != null){

            //if next node has the same value
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            // else just go to the next node
            else {
                temp = temp.next;
            }
        }
        //return head
        return head;
    }
}
